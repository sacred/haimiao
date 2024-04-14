package com.macro.mall.common.consts;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 状态枚举
 * @author wengxk
 */
@Getter
@AllArgsConstructor
public enum StateEnum {
    INVALID(0, "无效,未确认"),
    VALID(1, "有效,确认"),
    ;

    private int code;
    private String message;
}
