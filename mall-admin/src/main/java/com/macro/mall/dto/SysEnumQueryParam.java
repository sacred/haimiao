package com.macro.mall.dto;

import com.macro.mall.common.consts.SysEnumEnum;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

/**
 * 枚举查询条件
 */
@Getter
@Setter
public class SysEnumQueryParam {

    @NotEmpty
    @ApiModelProperty(value = "枚举类型", required = true)
    private String enumType;

    @ApiModelProperty("枚举编码")
    private String enumCode;

    @ApiModelProperty("枚举值")
    private String enumValue;

    @ApiModelProperty(value = "状态", dataType = "Interger", allowableValues = "0,1")
    private Integer state;

}
