package com.macro.mall.service;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * ID规则生成器
 * @author wengxk
 */
public interface IdRuleGenerator {

    @Getter
    @AllArgsConstructor
    public enum IdRuleType{
        CUST_ORDER("CUST_ORDER", "客户订单", "ORD"),
        TRANS_ORDER("TRANS_ORDER", "运输单", "TRS"),
        ;

        String code;
        String name;
        String prefix;
    }

    /**
     * 生成单号
     * @param type
     * @return
     */
    String generator(IdRuleType type);
}
