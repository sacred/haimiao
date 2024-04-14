package com.macro.mall.common.consts;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
@AllArgsConstructor
public enum SysEnumEnum {
    SYS_ENUM_MAP("SYS_ENUM_MAP", "系统枚举映射配置"),
    PACKING_TYPE("PACKING_TYPE", "规格"),
    ORDER_STATE("ORDER_STATE", "订单状态"),

    GOOD_TYPE("GOOD_TYPE", "品种"),
    LOCAL_CUST("LOCAL_CUST", "内地客户"),
    HK_CUST("HK_CUST", "香港客户"),
    PLATE_NUMBER("PLATE_NUMBER", "车牌号码"),
    EXPORT_COMPANY("EXPORT_COMPANY", "出口公司"),
    BUCKET_NO("BUCKET_NO", "桶位"),
    ;

    private String type;
    private String message;

    private static Map<String, SysEnumEnum> sysEnumMap = new HashMap<String, SysEnumEnum>();
    static {
        for (SysEnumEnum item : SysEnumEnum.values()) {
            sysEnumMap.put(item.getType(), item);
        }
    }

    public static SysEnumEnum find(String enumType) {
        SysEnumEnum sysEnumEnum = sysEnumMap.get(enumType);
        if (sysEnumEnum == null) {
            throw new RuntimeException("未定义枚举:"+enumType);
        }
        return sysEnumEnum;
    }
}
