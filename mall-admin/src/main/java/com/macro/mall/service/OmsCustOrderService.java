package com.macro.mall.service;

import com.macro.mall.dto.OmsCustOrderDto;
import com.macro.mall.dto.OmsCustOrderQueryParam;
import com.macro.mall.dto.OmsCustOrderSettlementResult;
import com.macro.mall.model.OmsCustOrder;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 客户订单Service
 * @author wengxk
 */
public interface OmsCustOrderService {

    /**
     * 创建客户订单
     */
    @Transactional
    int create(OmsCustOrderDto omsCustOrder);

    /**
     * 取消客户订单
     */
    int cancel(Long id, String remark);

    /**
     * 更新客户订单
     */
    int update(OmsCustOrder omsCustOrder);

    /**
     * 客户订单详情
     */
    OmsCustOrder info(Long id);

    /**
     * 客户订单分页查询
     * @param queryParam
     * @param pageNum
     * @param pageSize
     * @return
     */
    List<OmsCustOrder> listPage(OmsCustOrderQueryParam queryParam, Integer pageNum, Integer pageSize);

    /**
     * 客户结算单查询
     * @param queryParam
     * @return
     */
    List<OmsCustOrderSettlementResult> settlementList(OmsCustOrderQueryParam queryParam);

}
