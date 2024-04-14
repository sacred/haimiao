package com.macro.mall.mapper;

import com.macro.mall.model.SysEnum;
import com.macro.mall.model.SysEnumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysEnumMapper {
    long countByExample(SysEnumExample example);

    int deleteByExample(SysEnumExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysEnum row);

    int insertSelective(SysEnum row);

    List<SysEnum> selectByExample(SysEnumExample example);

    SysEnum selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") SysEnum row, @Param("example") SysEnumExample example);

    int updateByExample(@Param("row") SysEnum row, @Param("example") SysEnumExample example);

    int updateByPrimaryKeySelective(SysEnum row);

    int updateByPrimaryKey(SysEnum row);
}