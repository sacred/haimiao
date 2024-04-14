package com.macro.mall.dto;

import com.macro.mall.model.OmsCustOrder;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Generated;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 客户结算单
 * @author wengxk
 */

@Data
@EqualsAndHashCode
@Generated
public class OmsVechileSettlementResult implements Serializable {

    @ApiModelProperty("下单时间")
    private Date orderDate;

    @ApiModelProperty("内地客户")
    private String localCust;

    @ApiModelProperty("合计运费")
    private BigDecimal totalFee;

    @ApiModelProperty("客户订单列表")
    List<OmsCustOrder> custOrderList;

}
