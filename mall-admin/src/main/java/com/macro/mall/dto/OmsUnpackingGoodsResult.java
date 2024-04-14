package com.macro.mall.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * 客户订单未配载货物差异信息
 * @author wengxk
 */


@Getter
@Setter
public class OmsUnpackingGoodsResult {
    BigDecimal diffWeight = new BigDecimal(0);
    Integer diffNumber = 0;
}
