package com.macro.mall.service;

import com.macro.mall.dto.*;
import com.macro.mall.model.OmsBucketGoodsDetail;
import org.apache.ibatis.annotations.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 调度配载服务
 * @author wengxk
 */
public interface OmsLoadingBucketService {

    @Transactional
    int create(OmsBucketDetailDto bucketDetailDto);

    @Transactional
    int update(OmsBucketDetailDto bucketDetailDto);

    List<OmsOrderLoadingResult> list(OmsBucketDetailQueryParam queryParam);

    OmsBucketDetailDto info(Long goodsDetailId);

    OmsUnpackingGoodsResult getUnLoadingGoods(OmsUnLoadingGoodsQueryParam queryParam);

    @Transactional
    int loadingConfirm(Long goodsDetailId, Integer isConfirm);

    int sendingConfirm(Long goodsDetailId, Integer isConfirm, String remark);

    int genCustDeclaration(Long id);

    List<OmsGoodsExportResult> getCustDeclarationInfo(Long id);

    List<OmsSettlementResult> getCustSettlement(OmsBucketDetailQueryParam queryParam);

    List<OmsSettlementResult> getVechileSettlement(OmsBucketDetailQueryParam queryParam);

    List<OmsBucketGoodsDetail> getCurrSummary(String currDate);

    List<OmsLoadingWeekSummaryResult> getLastWeekSummary(String currDate);
}
