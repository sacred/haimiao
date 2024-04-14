package com.macro.mall.service;

import com.macro.mall.common.consts.SysEnumEnum;
import com.macro.mall.dto.SysEnumQueryParam;
import com.macro.mall.model.SysEnum;

import java.util.List;

public interface SysEnumService {

    /**
     * 创建枚举
     * @return
     */
    int create(SysEnum sysEnum);

    /**
     * 更新枚举
     * @param sysEnum
     * @return
     */
    int update(SysEnum sysEnum);

    /**
     * 根据类型获取枚举列表
     * @param queryParam
     * @return
     */
    List<SysEnum> listEnumByType(SysEnumQueryParam queryParam);

    /**
     * 根据枚举类型+枚举编码获取枚举定义
     * @param enumTyp
     * @param enumCode
     * @return
     */
    SysEnum getEnumByCode(String enumTyp, String enumCode);

    /**
     * 根据枚举类型，枚举值获取枚举定义
     * @param enumTyp
     * @param enumCode
     * @return
     */
    SysEnum getEnumByValue(String enumTyp, String enumCode);

}
