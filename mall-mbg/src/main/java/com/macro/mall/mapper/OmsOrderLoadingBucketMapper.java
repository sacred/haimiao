package com.macro.mall.mapper;

import com.macro.mall.model.OmsOrderLoadingBucket;
import com.macro.mall.model.OmsOrderLoadingBucketExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OmsOrderLoadingBucketMapper {
    long countByExample(OmsOrderLoadingBucketExample example);

    int deleteByExample(OmsOrderLoadingBucketExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OmsOrderLoadingBucket row);

    int insertSelective(OmsOrderLoadingBucket row);

    List<OmsOrderLoadingBucket> selectByExample(OmsOrderLoadingBucketExample example);

    OmsOrderLoadingBucket selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") OmsOrderLoadingBucket row, @Param("example") OmsOrderLoadingBucketExample example);

    int updateByExample(@Param("row") OmsOrderLoadingBucket row, @Param("example") OmsOrderLoadingBucketExample example);

    int updateByPrimaryKeySelective(OmsOrderLoadingBucket row);

    int updateByPrimaryKey(OmsOrderLoadingBucket row);
}