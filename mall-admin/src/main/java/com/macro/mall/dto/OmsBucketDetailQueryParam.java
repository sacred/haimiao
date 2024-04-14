package com.macro.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

/**
 * 装载查询入参
 * @author wengxk
 */
@Getter
@Setter
public class OmsBucketDetailQueryParam extends OmsCustOrderQueryParam {

    @ApiModelProperty("运单编号")
    String loadingNo;

    @ApiModelProperty(value = "车牌号", required = true)
    String plateNumber;

    @ApiModelProperty(value = "配载表主键ID")
    Long id;

    @ApiModelProperty(value = "桶位表主键ID")
    Long bucketId;

    @ApiModelProperty(value = "桶位编号")
    String bucketNo;
}
