package com.macro.mall.common.consts;

import lombok.Getter;

/**
 * 客户订单状态枚举
 * @author wengxk
 */
@Getter
public enum CustOrderStateEnum {
    //0,取消下单
//    1,客户下单
//2,调度装车
//3,装车确认
//4,报关完成
//5,派货确认
    CACEL(0, "取消下单"),
    CREATE(1, "客户下单"),
    LOADING(2, "调度装车"),
    LOADING_CONFIRM(3, "装车确认"),
    CLEARANCE(4, "报关完成"),
    SENDING_CONFIRM(5, "派货确认"),
    ;

    private int code;
    private String message;

    private CustOrderStateEnum(int code) {
        this.code = code;
    }

    private CustOrderStateEnum(int code, String message) {
        this.code = code;
    }
}
