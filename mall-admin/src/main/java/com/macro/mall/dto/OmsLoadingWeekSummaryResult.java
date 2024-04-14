package com.macro.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 首页周统计曲线
 * @author wengxk
 */
@Getter
@Setter
public class OmsLoadingWeekSummaryResult {

    @ApiModelProperty(value = "装载日期")
    private Date loadingDate;

    @ApiModelProperty(value = "内地客户")
    private String localCust;

    @ApiModelProperty(value = "总件数")
    private Integer totalNumber;

    @ApiModelProperty(value = "总重量(kg)")
    private BigDecimal totalWeight;

    @ApiModelProperty(value = "运费")
    private BigDecimal freightFee;
}
