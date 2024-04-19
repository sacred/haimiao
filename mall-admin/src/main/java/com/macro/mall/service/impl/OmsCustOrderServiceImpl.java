package com.macro.mall.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.github.pagehelper.PageHelper;
import com.macro.mall.common.consts.CustOrderStateEnum;
import com.macro.mall.common.consts.SysEnumEnum;
import com.macro.mall.common.exception.ApiException;
import com.macro.mall.common.service.RedisService;
import com.macro.mall.dao.OmsCustOrderDao;
import com.macro.mall.dto.*;
import com.macro.mall.mapper.OmsCustOrderMapper;
import com.macro.mall.model.OmsCustOrder;
import com.macro.mall.service.IdRuleGenerator;
import com.macro.mall.service.OmsCustOrderService;
import com.macro.mall.service.OmsLoadingBucketService;
import com.macro.mall.service.SysEnumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class OmsCustOrderServiceImpl implements OmsCustOrderService {

    @Autowired
    @Qualifier("OrderIdGenerator")
    IdRuleGenerator idRuleGenerator;
    @Autowired
    SysEnumService sysEnumService;
    @Autowired
    OmsCustOrderMapper custOrderMapper;
    @Autowired
    OmsCustOrderDao custOrderDao;
    @Autowired
    OmsLoadingBucketService loadingBucketService;

    @Override
    public int create(OmsCustOrderDto custOrderDto) {
        AtomicInteger count = new AtomicInteger();
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        custOrderDto.getOrderDetailDtoList().parallelStream().forEach(detailDto -> {
            OmsCustOrder omsCustOrder = new OmsCustOrder();
            BeanUtil.copyProperties(custOrderDto, omsCustOrder, "orderDetailDtoList");
            BeanUtil.copyProperties(detailDto, omsCustOrder);
            omsCustOrder.setAdditionNumber(0);
            omsCustOrder.setTotalWeight(new BigDecimal(0));
            omsCustOrder.setCustOrderNo(idRuleGenerator.generator(IdRuleGenerator.IdRuleType.CUST_ORDER));
            calculateData(omsCustOrder);
            omsCustOrder.setOperator(authentication.getName());
            count.addAndGet(custOrderMapper.insertSelective(omsCustOrder));
        });
        return count.get();
    }

    @Override
    public int cancel(Long id, String remark) {
        OmsCustOrder custOrder = custOrderMapper.selectByPrimaryKey(id);
        OmsUnLoadingGoodsQueryParam param = new OmsUnLoadingGoodsQueryParam();
        BeanUtil.copyProperties(custOrder, param);
        param.setLoadingDate(custOrder.getOrderDate());
        OmsUnpackingGoodsResult unPackGoods = loadingBucketService.getUnLoadingGoods(param);
        //取消下单和更新客户订单数量，需要检查不能小于已经装货确认的数量，匹配当天数据
        if (custOrder.getTotalNumber() <= unPackGoods.getDiffNumber() && custOrder.getTotalWeight().compareTo(unPackGoods.getDiffWeight()) <= 0) {
            OmsCustOrder omsCustOrder = new OmsCustOrder();
            omsCustOrder.setId(id);
            omsCustOrder.setRemark(remark);
            //取消下单
            omsCustOrder.setState(CustOrderStateEnum.CACEL.getCode());
            return custOrderMapper.updateByPrimaryKeySelective(omsCustOrder);
        } else {
            throw new ApiException("订单已配载，不允许取消，请电话沟通！");
        }
    }

    @Override
    public int update(OmsCustOrder omsCustOrder) {
        calculateData(omsCustOrder);
        OmsCustOrder oldCustOrder = custOrderMapper.selectByPrimaryKey(omsCustOrder.getId());
        OmsUnLoadingGoodsQueryParam param = new OmsUnLoadingGoodsQueryParam();
        BeanUtil.copyProperties(oldCustOrder, param);
        param.setLoadingDate(oldCustOrder.getOrderDate());
        OmsUnpackingGoodsResult unPackGoods = loadingBucketService.getUnLoadingGoods(param);
        //取消下单和更新客户订单数量，需要检查不能小于已经装货确认的数量，匹配当天数据
        if ((oldCustOrder.getTotalNumber() - omsCustOrder.getTotalNumber()) <= unPackGoods.getDiffNumber() && (oldCustOrder.getTotalWeight().subtract(omsCustOrder.getTotalWeight())).compareTo(unPackGoods.getDiffWeight()) <= 0) {
            return custOrderMapper.updateByPrimaryKeySelective(omsCustOrder);
        } else {
            throw new ApiException(String.format("该货物已配载，最多可减少%d件，%sKg，如有疑问，请电话沟通！！", unPackGoods.getDiffNumber(), unPackGoods.getDiffWeight()));
        }
    }

    @Override
    public OmsCustOrder info(Long id) {
        return custOrderMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<OmsCustOrder> listPage(OmsCustOrderQueryParam queryParam, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return custOrderDao.getList(queryParam);
    }

    @Override
    public List<OmsCustOrderSettlementResult> settlementList(OmsCustOrderQueryParam queryParam) {
        return custOrderDao.getSettlementlist(queryParam);
    }

    /**
     * 计算总重量、件数、金额
     * @param omsCustOrder
     */
    private void calculateData(OmsCustOrder omsCustOrder) {
        omsCustOrder.setAdditionNumber(0);
        omsCustOrder.setTotalWeight(new BigDecimal(0));
        omsCustOrder.setTotalNumber(omsCustOrder.getFclNumber());
        omsCustOrder.setTotalWeight(new BigDecimal(omsCustOrder.getFclNumber()).multiply(omsCustOrder.getUnitWeight()));
        if (omsCustOrder.getAdditionWeight1() != null && omsCustOrder.getAdditionWeight1().compareTo(BigDecimal.ZERO) != 0) {
            omsCustOrder.setAdditionNumber(omsCustOrder.getAdditionNumber()+1);
            omsCustOrder.setTotalWeight(omsCustOrder.getTotalWeight().add(omsCustOrder.getAdditionWeight1()));
        }
        if (omsCustOrder.getAdditionWeight2() != null && omsCustOrder.getAdditionWeight2().compareTo(BigDecimal.ZERO) != 0) {
            omsCustOrder.setAdditionNumber(omsCustOrder.getAdditionNumber()+1);
            omsCustOrder.setTotalWeight(omsCustOrder.getTotalWeight().add(omsCustOrder.getAdditionWeight2()));
        }
        omsCustOrder.setTotalNumber(omsCustOrder.getTotalNumber() + omsCustOrder.getAdditionNumber());
        //规格单价
        BigDecimal freightPrice = new BigDecimal(sysEnumService.getEnumByCode(SysEnumEnum.PACKING_TYPE.getType(), omsCustOrder.getPackingType()).getEnumMapValue());
        omsCustOrder.setFreightFee(new BigDecimal(omsCustOrder.getTotalNumber()).multiply(freightPrice));
        omsCustOrder.setState(CustOrderStateEnum.CREATE.getCode());
    }
}
