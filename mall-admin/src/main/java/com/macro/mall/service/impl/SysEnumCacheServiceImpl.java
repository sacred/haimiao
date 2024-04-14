package com.macro.mall.service.impl;

import cn.hutool.core.util.StrUtil;
import com.macro.mall.common.consts.SysEnumEnum;
import com.macro.mall.common.service.RedisService;
import com.macro.mall.model.SysEnum;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 基础数据枚举Service
 *
 * @author wengxk
 */
@Log4j2
@Service
public class SysEnumCacheServiceImpl implements SysEnumCacheService {
    @Value("${redis.database}:oms")
    String REDIS_DATABASE;
    @Value("${redis.key.enum:enum}")
    String REDIS_KEY_ENUM;

    @Autowired
    RedisService redisService;

    @Override
    public void delSysEnumCacheByType(String enumType) {
        String key = REDIS_DATABASE + ":" + REDIS_KEY_ENUM + ":" + enumType;
        redisService.del(key);
    }

    @Override
    public void setSysEnumCacheByType(List<SysEnum> sysEnumList) {
        sysEnumList.stream().forEach(sysEnum -> {
            String key = REDIS_DATABASE + ":" + REDIS_KEY_ENUM + ":" + sysEnum.getEnumType();
            redisService.lPush(key, sysEnum);
        });
    }

    @Override
    public List<SysEnum> getSysEnumCacheByType(String enumType) {
        String key = REDIS_DATABASE + ":" + REDIS_KEY_ENUM + ":" + enumType;
        List list = redisService.lRange(key, 0, -1);
        if (list == null) {
            return null;
        }
        return (List<SysEnum>) list.stream().map(o -> (SysEnum) o).collect(Collectors.toList());
    }
}
