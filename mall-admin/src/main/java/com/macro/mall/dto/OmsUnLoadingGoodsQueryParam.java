package com.macro.mall.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * 根据运单查询匹配客户订单，查询客户下单与已配载的差额，即未配载的货物
 *
 * @author wengxk
 */
@Getter
@Setter
public class OmsUnLoadingGoodsQueryParam {

    @NotNull
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @ApiModelProperty("运输日期")
    Date loadingDate;

    @NotEmpty
    @ApiModelProperty("内地客户")
    String localCust;

    @NotEmpty
    @ApiModelProperty("香港客户")
    String hkCust;

    @NotEmpty
    @ApiModelProperty("品种")
    String goodType;

    @NotEmpty
    @ApiModelProperty("规格")
    String packingType;
}
