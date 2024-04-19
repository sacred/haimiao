package com.macro.mall.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.github.pagehelper.PageHelper;
import com.macro.mall.common.consts.CustOrderStateEnum;
import com.macro.mall.common.consts.SysEnumEnum;
import com.macro.mall.common.service.RedisService;
import com.macro.mall.dao.OmsCustOrderDao;
import com.macro.mall.dto.OmsCustOrderDto;
import com.macro.mall.dto.OmsCustOrderQueryParam;
import com.macro.mall.dto.OmsCustOrderSettlementResult;
import com.macro.mall.mapper.OmsCustOrderMapper;
import com.macro.mall.model.OmsCustOrder;
import com.macro.mall.service.IdRuleGenerator;
import com.macro.mall.service.OmsCustOrderService;
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
        OmsCustOrder omsCustOrder = new OmsCustOrder();
        omsCustOrder.setId(id);
        omsCustOrder.setRemark(remark);
        //取消下单
        omsCustOrder.setState(CustOrderStateEnum.CACEL.getCode());
        return custOrderMapper.updateByPrimaryKeySelective(omsCustOrder);
    }

    @Override
    public int update(OmsCustOrder omsCustOrder) {
        calculateData(omsCustOrder);
        return custOrderMapper.updateByPrimaryKeySelective(omsCustOrder);
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
