package com.macro.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Generated;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 客户结算单
 * @author wengxk
 */

@Data
@EqualsAndHashCode
@Generated
public class OmsSettlementResult implements Serializable {

    @ApiModelProperty(value = "运单日期")
    private Date loadingDate;

    @ApiModelProperty(value = "内地客户")
    private String localCust;

    @ApiModelProperty(value = "车牌号")
    private String plateNumber;

    @ApiModelProperty(value = "运输单号")
    private String loadingNo;

    @ApiModelProperty(value = "品种")
    private String goodType;

    @ApiModelProperty(value = "规格")
    private String packingType;

    @ApiModelProperty(value = "桶位")
    private String bucketNo;

    @ApiModelProperty(value = "总件数")
    private Integer totalNumber;

    @ApiModelProperty(value = "总重量(kg)")
    private BigDecimal totalWeight;

    @ApiModelProperty(value = "运费")
    private BigDecimal freightFee;

    @ApiModelProperty(value = "备注")
    private String notes;
}
