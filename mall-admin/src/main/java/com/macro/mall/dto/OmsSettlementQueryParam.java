package com.macro.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * 客户订单查询参数
 * @author wengxk
 */
@Getter
@Setter
public class OmsSettlementQueryParam {

    @ApiModelProperty("内地客户")
    private String localCust;

    @ApiModelProperty("车牌号")
    private String plateNumber;

    @ApiModelProperty("装载开始日期")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String loadingDateStart;

    @ApiModelProperty("装载截止日期")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String loadingDateEnd;
}
