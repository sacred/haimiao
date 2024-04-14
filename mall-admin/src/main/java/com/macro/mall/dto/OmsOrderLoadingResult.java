package com.macro.mall.dto;

import com.macro.mall.model.OmsOrderLoading;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.math.BigDecimal;
import java.util.List;

/**
 * 车辆配载信息DTO
 * @author wengxk
 */
@Data
public class OmsOrderLoadingResult extends OmsOrderLoading {

    @ApiModelProperty(value = "装载总件数")
    private Integer totalNumber;

    @ApiModelProperty(value = "装载总重量(kg)")
    private BigDecimal totalWeight;

    @ApiModelProperty(value = "运费")
    private BigDecimal freightFee;

    @ApiModelProperty(value = "货物明细最后（最小）状态，见SYS_ENUM.ORDER_STATE")
    private Integer minState;

    @ApiModelProperty(value = "货物明细最新（最大）状态，见SYS_ENUM.ORDER_STATE")
    private Integer maxState;

    @ApiModelProperty(value = "桶位详情", required = true)
    List<OmsBucketDetailDto> bucketDetailList;
}
