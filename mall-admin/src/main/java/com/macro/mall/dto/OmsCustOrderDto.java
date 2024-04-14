package com.macro.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.util.List;

/**
 * 客户订单DTO
 * @author wengxk
 */
@Data
public class OmsCustOrderDto {
    @NotEmpty(message = "大陆客户不能为空")
    @ApiModelProperty(value = "内地客户", required = true)
    private String localCust;

    @NotEmpty(message = "香港客户不能为空")
    @ApiModelProperty(value = "香港客户")
    private String hkCust;

    @ApiModelProperty(value = "备注")
    private String remark;

    @NotEmpty
    @ApiModelProperty(value = "客户下单明细")
    List<OmsCustOrderDetailDto> orderDetailDtoList;
}
