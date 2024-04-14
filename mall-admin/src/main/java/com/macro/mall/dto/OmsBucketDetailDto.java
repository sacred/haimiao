package com.macro.mall.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.macro.mall.model.OmsBucketGoodsDetail;
import com.macro.mall.model.OmsOrderLoading;
import com.macro.mall.model.OmsOrderLoadingBucket;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.util.Date;
import java.util.List;

/**
 * 货物装载详情DTO
 * @author wengxk
 */
@Data
public class OmsBucketDetailDto extends OmsOrderLoadingBucket{

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @ApiModelProperty(value = "装载日期", required = true)
    private Date loadingDate;

    @ApiModelProperty(value = "桶内货物列表", required = true)
    List<OmsBucketGoodsDetail> goodsDetailList;
}
