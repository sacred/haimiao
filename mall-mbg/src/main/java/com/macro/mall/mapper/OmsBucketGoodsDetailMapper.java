package com.macro.mall.mapper;

import com.macro.mall.model.OmsBucketGoodsDetail;
import com.macro.mall.model.OmsBucketGoodsDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OmsBucketGoodsDetailMapper {
    long countByExample(OmsBucketGoodsDetailExample example);

    int deleteByExample(OmsBucketGoodsDetailExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OmsBucketGoodsDetail row);

    int insertSelective(OmsBucketGoodsDetail row);

    List<OmsBucketGoodsDetail> selectByExample(OmsBucketGoodsDetailExample example);

    OmsBucketGoodsDetail selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") OmsBucketGoodsDetail row, @Param("example") OmsBucketGoodsDetailExample example);

    int updateByExample(@Param("row") OmsBucketGoodsDetail row, @Param("example") OmsBucketGoodsDetailExample example);

    int updateByPrimaryKeySelective(OmsBucketGoodsDetail row);

    int updateByPrimaryKey(OmsBucketGoodsDetail row);
}