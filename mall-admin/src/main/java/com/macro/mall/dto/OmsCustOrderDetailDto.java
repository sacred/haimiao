package com.macro.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import java.math.BigDecimal;

/**
 * 客户下单明细列表
 * @author wengxk
 */
@Data
public class OmsCustOrderDetailDto {
    @ApiModelProperty(value = "主键，修改时带回")
    private Long id;

    @ApiModelProperty(value = "订单ID")
    private String custOrderNo;

    @NotEmpty( message = "品种不能为空")
    @ApiModelProperty(value = "品种", required = true)
    private String goodType;

    @NotEmpty( message = "规格不能为空")
    @ApiModelProperty(value = "规格", required = true)
    private String packingType;

    @Min(value = 0)
    @ApiModelProperty(value = "整件件数")
    private Integer fclNumber;

    @Min(value = 0)
    @ApiModelProperty(value = "每件重量")
    private BigDecimal unitWeight;

    @ApiModelProperty(value = "尾数1重量（kg）")
    private BigDecimal additionWeight1;

    @ApiModelProperty(value = "尾数2重量（kg）")
    private BigDecimal additionWeight2;
}
