package com.macro.mall.dao;

import com.macro.mall.dto.OmsCustOrderQueryParam;
import com.macro.mall.dto.OmsCustOrderSettlementResult;
import com.macro.mall.model.OmsCustOrder;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 自定义客户订单相关查询Dao
 */
public interface OmsCustOrderDao {

    List<OmsCustOrder> getList(@Param("queryParam") OmsCustOrderQueryParam queryParam);

    /**
     * 客户结算单查询
     * @param queryParam
     * @return
     */
    List<OmsCustOrderSettlementResult> getSettlementlist(@Param("queryParam") OmsCustOrderQueryParam queryParam);

}
