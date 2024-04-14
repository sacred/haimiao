package com.macro.mall.mapper;

import com.macro.mall.model.OmsOrderLoading;
import com.macro.mall.model.OmsOrderLoadingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OmsOrderLoadingMapper {
    long countByExample(OmsOrderLoadingExample example);

    int deleteByExample(OmsOrderLoadingExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OmsOrderLoading row);

    int insertSelective(OmsOrderLoading row);

    List<OmsOrderLoading> selectByExample(OmsOrderLoadingExample example);

    OmsOrderLoading selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") OmsOrderLoading row, @Param("example") OmsOrderLoadingExample example);

    int updateByExample(@Param("row") OmsOrderLoading row, @Param("example") OmsOrderLoadingExample example);

    int updateByPrimaryKeySelective(OmsOrderLoading row);

    int updateByPrimaryKey(OmsOrderLoading row);
}