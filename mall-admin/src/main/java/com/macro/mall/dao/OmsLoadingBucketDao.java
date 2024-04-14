package com.macro.mall.dao;

import com.macro.mall.dto.*;
import com.macro.mall.model.OmsBucketGoodsDetail;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 自定义调度配载Dao
 * @author wengxk
 */
public interface OmsLoadingBucketDao {

    List<OmsOrderLoadingResult> list(@Param("queryParam") OmsBucketDetailQueryParam queryParam);

    OmsBucketDetailDto info(@Param("id") Long goodsDetailId);

    OmsUnpackingGoodsResult getUnLoadingGoods(@Param("queryParam") OmsUnLoadingGoodsQueryParam queryParam);

    List<OmsGoodsExportResult> getCustDeclarationInfo(@Param("id") Long orderLoadingId);

    List<OmsSettlementResult> custSettlement(@Param("queryParam") OmsBucketDetailQueryParam queryParam);

    List<OmsSettlementResult> vechileSettlement(@Param("queryParam") OmsBucketDetailQueryParam queryParam);

    List<OmsBucketGoodsDetail> getCurrSummary(@Param("currDate") String currDate);

    List<OmsLoadingWeekSummaryResult> getLastWeekSummary(@Param("currDate") String currDate);

}
