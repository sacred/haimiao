package com.macro.mall.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.macro.mall.common.consts.CustOrderStateEnum;
import com.macro.mall.common.consts.SysEnumEnum;
import com.macro.mall.dao.OmsLoadingBucketDao;
import com.macro.mall.dto.*;
import com.macro.mall.mapper.OmsBucketGoodsDetailMapper;
import com.macro.mall.mapper.OmsOrderLoadingBucketMapper;
import com.macro.mall.mapper.OmsOrderLoadingMapper;
import com.macro.mall.model.*;
import com.macro.mall.service.IdRuleGenerator;
import com.macro.mall.service.OmsLoadingBucketService;
import com.macro.mall.service.SysEnumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/**
 * 调度配载服务
 *
 * @author wengxk
 */
@Service
public class OmsLoadingBucketServiceImpl implements OmsLoadingBucketService {
    @Autowired
    @Qualifier("OrderIdGenerator")
    IdRuleGenerator idRuleGenerator;
    @Autowired
    SysEnumService sysEnumService;
    @Autowired
    OmsOrderLoadingMapper loadingMapper;
    @Autowired
    OmsOrderLoadingBucketMapper bucketMapper;
    @Autowired
    OmsBucketGoodsDetailMapper goodsDetailMapper;
    @Autowired
    OmsLoadingBucketDao bucketDao;


    @Override
    public int create(OmsBucketDetailDto bucketDetailDto) {
        AtomicInteger count = new AtomicInteger();
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        List<OmsBucketGoodsDetail> bucketGoodsDetailList = bucketDetailDto.getGoodsDetailList();

        //先查询是否存在该车辆当天配载记录，有则直接使用，否更创建
        OmsOrderLoadingExample loadingExample = new OmsOrderLoadingExample();
        OmsOrderLoadingExample.Criteria loadingCriteria = loadingExample.createCriteria();
        loadingCriteria.andPlateNumberEqualTo(bucketDetailDto.getPlateNumber())
                .andLoadingDateEqualTo(bucketDetailDto.getLoadingDate())
                .andStateEqualTo(CustOrderStateEnum.LOADING.getCode());
        List<OmsOrderLoading> loadingList = loadingMapper.selectByExample(loadingExample);
        Long loadingId = null;
        OmsOrderLoading omsOrderLoading = null;
        if (loadingList == null || loadingList.size() == 0) {
            //创建，记录装车表
            omsOrderLoading = new OmsOrderLoading();
            BeanUtil.copyProperties(bucketDetailDto, omsOrderLoading);
            omsOrderLoading.setLoadingNo(idRuleGenerator.generator(IdRuleGenerator.IdRuleType.TRANS_ORDER));
            omsOrderLoading.setOperator(authentication.getName());
            omsOrderLoading.setState(CustOrderStateEnum.LOADING.getCode());
            loadingMapper.insertSelective(omsOrderLoading);
            loadingId = omsOrderLoading.getId();
        } else {
            //使用已有数据
            omsOrderLoading = loadingList.get(0);
            loadingId = omsOrderLoading.getId();
        }

        //先查询是否存在该车辆当前桶位记录，有则直接使用，否更创建
        OmsOrderLoadingBucketExample bucketExample = new OmsOrderLoadingBucketExample();
        OmsOrderLoadingBucketExample.Criteria bucketCriteria = bucketExample.createCriteria();
        bucketCriteria.andOrderLoadingIdEqualTo(loadingId)
                .andBucketNoEqualTo(bucketDetailDto.getBucketNo());
        List<OmsOrderLoadingBucket> bucketList = bucketMapper.selectByExample(bucketExample);
        Long bucketId = null;
        if (bucketList == null || bucketList.size() == 0) {
            //创建，记录桶位表
            OmsOrderLoadingBucket omsOrderLoadingBucket = new OmsOrderLoadingBucket();
            BeanUtil.copyProperties(bucketDetailDto, omsOrderLoadingBucket);
            omsOrderLoadingBucket.setOrderLoadingId(loadingId);
            omsOrderLoadingBucket.setOperator(authentication.getName());
            omsOrderLoadingBucket.setState(CustOrderStateEnum.LOADING.getCode());
            bucketMapper.insertSelective(omsOrderLoadingBucket);
            bucketId = omsOrderLoadingBucket.getId();
        } else {
            //使用已有数据
            bucketId = bucketList.get(0).getId();
        }

        final OmsOrderLoading finalOmsOrderLoading = omsOrderLoading;
        final Long finalLoadingId = loadingId;
        final Long finalBucketId = bucketId;
        bucketGoodsDetailList.parallelStream().forEach(goodsDetail -> {
            //记录桶位货物列表
            goodsDetail.setOrderLoadingId(finalLoadingId);
            goodsDetail.setBucketId(finalBucketId);
            goodsDetail.setPlateNumber(finalOmsOrderLoading.getPlateNumber());
            assocCustOrder(finalOmsOrderLoading.getLoadingDate(), goodsDetail);
            calculateData(goodsDetail);
            goodsDetail.setOperator(authentication.getName());
            goodsDetail.setState(CustOrderStateEnum.LOADING.getCode());
            count.addAndGet(goodsDetailMapper.insertSelective(goodsDetail));
        });
        return count.get();
    }

    @Override
    public int update(OmsBucketDetailDto bucketDetailDto) {
        final Long loadingId = bucketDetailDto.getOrderLoadingId();
        Long bucketId = bucketDetailDto.getId();
        if (loadingId == null) {
            throw new RuntimeException("车辆配载表 ID 为空！");
        }
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (bucketId == null) {
            //不存在，则新增桶位表信息
            OmsOrderLoadingBucket omsOrderLoadingBucket = new OmsOrderLoadingBucket();
            BeanUtil.copyProperties(bucketDetailDto, omsOrderLoadingBucket);
            omsOrderLoadingBucket.setOrderLoadingId(loadingId);
            omsOrderLoadingBucket.setOperator(authentication.getName());
            omsOrderLoadingBucket.setState(CustOrderStateEnum.LOADING.getCode());
            bucketMapper.insertSelective(omsOrderLoadingBucket);
            bucketId = omsOrderLoadingBucket.getId();
        }
        OmsOrderLoading orderLoading = loadingMapper.selectByPrimaryKey(loadingId);
        AtomicInteger count = new AtomicInteger();

        //增量更新，取库数据与提交列表数据进行对比，先更新和新增，最后删除
        OmsBucketGoodsDetailExample goodsDetailExample = new OmsBucketGoodsDetailExample();
        OmsBucketGoodsDetailExample.Criteria criteria = goodsDetailExample.createCriteria();
        criteria.andOrderLoadingIdEqualTo(loadingId).andBucketIdEqualTo(bucketId);
        List<OmsBucketGoodsDetail> goodsDetailList = goodsDetailMapper.selectByExample(goodsDetailExample);
        Set<Long> goodsDetailIds = goodsDetailList.stream().map(OmsBucketGoodsDetail::getId).collect(Collectors.toSet());
        List<OmsBucketGoodsDetail> bucketGoodsDetailList = bucketDetailDto.getGoodsDetailList();
        final Long finalBucketId = bucketId;
        bucketGoodsDetailList.stream().forEach(goodsDetail -> {
            //记录桶位货物列表
            goodsDetail.setOrderLoadingId(loadingId);
            goodsDetail.setBucketId(finalBucketId);
            goodsDetail.setPlateNumber(orderLoading.getPlateNumber());
            goodsDetail.setOperator(authentication.getName());
            assocCustOrder(orderLoading.getLoadingDate(), goodsDetail);
            calculateData(goodsDetail);
            if (goodsDetail.getId() != null && goodsDetail.getId() > 0) {
                count.addAndGet(goodsDetailMapper.updateByPrimaryKeySelective(goodsDetail));
                goodsDetailIds.remove(goodsDetail.getId());
            } else {
                goodsDetail.setState(CustOrderStateEnum.LOADING.getCode());
                count.addAndGet(goodsDetailMapper.insertSelective(goodsDetail));
            }
        });
        //删除货物
        goodsDetailIds.stream().forEach(id -> {
            count.addAndGet(goodsDetailMapper.deleteByPrimaryKey(id));
        });
        return count.get();
    }

    @Override
    public List<OmsOrderLoadingResult> list(OmsBucketDetailQueryParam queryParam) {
        return bucketDao.list(queryParam);
    }

    @Override
    public OmsBucketDetailDto info(Long goodsDetailId) {
        return bucketDao.info(goodsDetailId);
    }

    @Override
    public OmsUnpackingGoodsResult getUnLoadingGoods(OmsUnLoadingGoodsQueryParam queryParam) {
        return bucketDao.getUnLoadingGoods(queryParam);
    }

    @Override
    public int genCustDeclaration(Long id) {
        OmsBucketGoodsDetail goodsDetail = new OmsBucketGoodsDetail();
        goodsDetail.setState(CustOrderStateEnum.CLEARANCE.getCode());
        OmsBucketGoodsDetailExample example = new OmsBucketGoodsDetailExample();
        OmsBucketGoodsDetailExample.Criteria criteria = example.createCriteria();
        criteria.andOrderLoadingIdEqualTo(id);
        return goodsDetailMapper.updateByExampleSelective(goodsDetail, example);
    }

    @Override
    public List<OmsSettlementResult> getCustSettlement(OmsBucketDetailQueryParam queryParam) {
        return bucketDao.custSettlement(queryParam);
    }

    @Override
    public List<OmsSettlementResult> getVechileSettlement(OmsBucketDetailQueryParam queryParam) {
        return bucketDao.vechileSettlement(queryParam);
    }

    @Override
    public List<OmsBucketGoodsDetail> getCurrSummary(String currDate) {
        return bucketDao.getCurrSummary(currDate);
    }

    @Override
    public List<OmsLoadingWeekSummaryResult> getLastWeekSummary(String currDate) {
        return bucketDao.getLastWeekSummary(currDate);
    }

    @Override
    public List<OmsGoodsExportResult> getCustDeclarationInfo(Long id) {
        return bucketDao.getCustDeclarationInfo(id);
    }

    @Override
    public int loadingConfirm(Long goodsDetailId, Integer isConfirm) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        OmsBucketGoodsDetail detail = new OmsBucketGoodsDetail();
        detail.setId(goodsDetailId);
        detail.setLoadingConfirmOperator(authentication.getName());
        detail.setLoadingConfirmTime(new Date());
        detail.setLoadingConfirmState(isConfirm);
        detail.setState(CustOrderStateEnum.LOADING_CONFIRM.getCode());
        return goodsDetailMapper.updateByPrimaryKeySelective(detail);
    }

    @Override
    public int sendingConfirm(Long goodsDetailId, Integer isConfirm, String notes) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        OmsBucketGoodsDetail detail = new OmsBucketGoodsDetail();
        detail.setId(goodsDetailId);
        detail.setSendingComfirmOperator(authentication.getName());
        detail.setSendingComfirmTime(new Date());
        detail.setSendingConfirmState(isConfirm);
        detail.setSendingConfirmNotes(notes);
        detail.setState(CustOrderStateEnum.SENDING_CONFIRM.getCode());
        return goodsDetailMapper.updateByPrimaryKeySelective(detail);
    }

    /**
     * 计算总重量、件数、金额
     * @param goodsDetail
     */
    private void calculateData(OmsBucketGoodsDetail goodsDetail) {
        goodsDetail.setAdditionNumber(0);
        goodsDetail.setTotalWeight(new BigDecimal(0));
        goodsDetail.setTotalNumber(goodsDetail.getFclNumber());
        goodsDetail.setTotalWeight(new BigDecimal(goodsDetail.getFclNumber()).multiply(goodsDetail.getUnitWeight()));
        if (goodsDetail.getAdditionWeight1().compareTo(BigDecimal.ZERO) != 0) {
            goodsDetail.setAdditionNumber(goodsDetail.getAdditionNumber() + 1);
            goodsDetail.setTotalWeight(goodsDetail.getTotalWeight().add(goodsDetail.getAdditionWeight1()));
        }
        if (goodsDetail.getAdditionWeight2().compareTo(BigDecimal.ZERO) != 0) {
            goodsDetail.setAdditionNumber(goodsDetail.getAdditionNumber() + 1);
            goodsDetail.setTotalWeight(goodsDetail.getTotalWeight().add(goodsDetail.getAdditionWeight2()));
        }
        goodsDetail.setTotalNumber(goodsDetail.getTotalNumber() + goodsDetail.getAdditionNumber());
        //规格单价
        BigDecimal freightPrice = new BigDecimal(sysEnumService.getEnumByCode(SysEnumEnum.PACKING_TYPE.getType(), goodsDetail.getPackingType()).getEnumMapValue());
        goodsDetail.setFreightFee(new BigDecimal(goodsDetail.getTotalNumber()).multiply(freightPrice));
    }

    /**
     * 关联客户订单，做客户订单配载
     * @param loadingDate
     * @param goodsDetail
     */
    private void assocCustOrder(Date loadingDate, OmsBucketGoodsDetail goodsDetail) {
        //本地客户、香港客户、品种、数量进行核对弱关联
        goodsDetail.getLocalCust();
        goodsDetail.getHkCust();
        goodsDetail.getGoodType();
        goodsDetail.getTotalWeight();

        goodsDetail.setCustOrderId(0L);
    }
}
