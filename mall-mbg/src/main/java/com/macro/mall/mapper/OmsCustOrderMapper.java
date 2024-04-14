package com.macro.mall.mapper;

import com.macro.mall.model.OmsCustOrder;
import com.macro.mall.model.OmsCustOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OmsCustOrderMapper {
    long countByExample(OmsCustOrderExample example);

    int deleteByExample(OmsCustOrderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OmsCustOrder row);

    int insertSelective(OmsCustOrder row);

    List<OmsCustOrder> selectByExample(OmsCustOrderExample example);

    OmsCustOrder selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") OmsCustOrder row, @Param("example") OmsCustOrderExample example);

    int updateByExample(@Param("row") OmsCustOrder row, @Param("example") OmsCustOrderExample example);

    int updateByPrimaryKeySelective(OmsCustOrder row);

    int updateByPrimaryKey(OmsCustOrder row);
}