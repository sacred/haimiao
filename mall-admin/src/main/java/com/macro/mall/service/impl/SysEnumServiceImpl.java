package com.macro.mall.service.impl;

import cn.hutool.core.util.StrUtil;
import com.macro.mall.common.consts.SysEnumEnum;
import com.macro.mall.dto.SysEnumQueryParam;
import com.macro.mall.mapper.SysEnumMapper;
import com.macro.mall.model.SysEnum;
import com.macro.mall.model.SysEnumExample;
import com.macro.mall.service.SysEnumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * 系统枚举Service
 * @author wengxk
 */
@Service
public class SysEnumServiceImpl implements SysEnumService {
    @Autowired
    SysEnumCacheService cacheService;
    @Autowired
    SysEnumMapper sysEnumMapper;

    @Override
    public int create(SysEnum sysEnum) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        sysEnum.setOperator(authentication.getName());
        cacheService.delSysEnumCacheByType(sysEnum.getEnumType());
        return sysEnumMapper.insertSelective(sysEnum);
    }

    @Override
    public int update(SysEnum sysEnum) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        sysEnum.setOperator(authentication.getName());
        cacheService.delSysEnumCacheByType(sysEnum.getEnumType());
        return sysEnumMapper.updateByPrimaryKeySelective(sysEnum);
    }

    @Override
    public List<SysEnum> listEnumByType(SysEnumQueryParam queryParam) {
        List<SysEnum> sysEnumList = cacheService.getSysEnumCacheByType(queryParam.getEnumType());
        //查询枚举状态不传时，表示是管理入口，需要传回所有数据，不走缓存
        boolean doNotCache = queryParam.getState() == null;
        if (doNotCache || sysEnumList == null || sysEnumList.isEmpty()) {
            SysEnumExample example = new SysEnumExample();
            SysEnumExample.Criteria criteria = example.createCriteria();
            criteria.andEnumTypeEqualTo(queryParam.getEnumType());
            if (StrUtil.isNotEmpty(queryParam.getEnumCode())) {
                criteria.andEnumCodeEqualTo(queryParam.getEnumCode());
            }
            if (StrUtil.isNotEmpty(queryParam.getEnumValue())) {
                criteria.andEnumValueLike("%"+queryParam.getEnumValue()+"%");
            }
            if (queryParam.getState() != null) {
                criteria.andStateEqualTo(queryParam.getState());
            }
            example.setOrderByClause("sort ASC");
            sysEnumList = sysEnumMapper.selectByExample(example);
            //查询枚举状态不传时,不走缓存
            if (!doNotCache) {
                cacheService.setSysEnumCacheByType(sysEnumList);
            }
        }
        return sysEnumList;
    }

    @Override
    public SysEnum getEnumByCode(String enumType, String enumCode) {
        SysEnumQueryParam param = new SysEnumQueryParam();
        param.setEnumType(enumType);
        param.setEnumCode(enumCode);
        List<SysEnum> list = this.listEnumByType(param);
        Optional<SysEnum> sysEnum = Optional.ofNullable(list).orElse(new ArrayList<>()).stream().filter(item -> item.getEnumCode().equals(enumCode)).findFirst();
        if (sysEnum.isPresent()) {
            return sysEnum.get();
        } else {
            return new SysEnum();
        }
    }

    @Override
    public SysEnum getEnumByValue(String enumType, String enumValue) {
        SysEnumQueryParam param = new SysEnumQueryParam();
        param.setEnumType(enumType);
        param.setEnumValue(enumValue);
        List<SysEnum> list = this.listEnumByType(param);
        Optional<SysEnum> sysEnum = Optional.ofNullable(list).orElse(new ArrayList<>()).stream().filter(item -> item.getEnumValue().equals(enumValue)).findFirst();
        if (sysEnum.isPresent()) {
            return sysEnum.get();
        } else {
            return new SysEnum();
        }
    }
}
