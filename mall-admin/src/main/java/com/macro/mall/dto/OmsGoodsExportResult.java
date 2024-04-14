package com.macro.mall.dto;

import com.macro.mall.model.OmsBucketGoodsDetail;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

/**
 * 报关单
 * @author wengxk
 */
@Getter
@Setter
public class OmsGoodsExportResult {

    @ApiModelProperty("运单编号")
    String loadingNo;

    @ApiModelProperty("装载日期")
    Date loadingDate;

    @ApiModelProperty("车牌号码")
    String plateNumber;

    @ApiModelProperty("出口公司")
    String exportCompany;

    @ApiModelProperty("出口货物列表")
    List<OmsBucketGoodsDetail> goodsExportList;
}
