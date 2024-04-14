package com.macro.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.List;

/**
 * 客户订单查询参数
 * @author wengxk
 */
@Getter
@Setter
public class OmsCustOrderQueryParam {

    @ApiModelProperty("客户订单编号")
    private String custOrderNo;

    @ApiModelProperty("内地客户")
    private String localCust;

    @ApiModelProperty("香港客户")
    private String hkCust;

    @ApiModelProperty("品类")
    private String goodType;

    @ApiModelProperty("订单状态")
    private List<Integer> orderState;

    @ApiModelProperty("下单开始日期,格式：yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String orderDate;

    @ApiModelProperty("下单开始日期,格式：yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String orderDateStart;

    @ApiModelProperty("下单截止日期,格式：yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String orderDateEnd;
}
