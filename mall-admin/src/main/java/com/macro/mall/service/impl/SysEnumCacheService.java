package com.macro.mall.service.impl;

import com.macro.mall.common.consts.SysEnumEnum;
import com.macro.mall.model.SysEnum;

import java.util.List;

/**
 * 系统枚举缓存服务
 * @author wengxk
 */
public interface SysEnumCacheService {

    /**
     * 删除枚举缓存
     * @param sysEnumEnum
     * @return
     */
    void delSysEnumCacheByType(String enumType);

    /**
     * 设置枚举缓存
     * @param sysEnumList
     */
    void setSysEnumCacheByType(List<SysEnum> sysEnumList);

    /**
     * 根据枚举类型获取缓存列表
     * @return
     */
    List<SysEnum> getSysEnumCacheByType(String enumType);
}
