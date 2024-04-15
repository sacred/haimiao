package com.macro.mall.controller;

import com.macro.mall.common.api.CommonResult;
import com.macro.mall.dto.*;
import com.macro.mall.model.OmsBucketGoodsDetail;
import com.macro.mall.service.OmsLoadingBucketService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@ResponseBody
@Api(tags = "OmsBucketGoodsDetailController")
@Tag(name = "OmsBucketGoodsDetailController", description = "调度配载")
@RequestMapping(value = "/loading")
public class OmsBucketGoodsDetailController {
    @Autowired
    OmsLoadingBucketService loadingBucketService;

    @ApiOperation("创建配载信息")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    private CommonResult create(@Valid @RequestBody OmsBucketDetailDto bucketDetailDto) {
        int count = loadingBucketService.create(bucketDetailDto);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("更新配载信息")
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    private CommonResult update(@Valid @RequestBody OmsBucketDetailDto bucketDetailDto) {
        int count = loadingBucketService.update(bucketDetailDto);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("车辆配载桶位列表")
    @RequestMapping(value = "/list", method
            = RequestMethod.POST)
    private CommonResult<List<OmsOrderLoadingResult>> listOrderLoading(OmsBucketDetailQueryParam queryParam) {
        List<OmsOrderLoadingResult> bucketDetailDtoList = loadingBucketService.list(queryParam);
        return CommonResult.success(bucketDetailDtoList);
    }

    @ApiOperation("具体某个配载桶位信息")
    @RequestMapping(value = "/info/{id}", method = RequestMethod.GET)
    private CommonResult<OmsOrderLoadingResult> getOrderLoadingInfo(@PathVariable("id") Long loadingId) {
        OmsBucketDetailQueryParam queryParam = new OmsBucketDetailQueryParam();
        queryParam.setId(loadingId);
        List<OmsOrderLoadingResult> bucketDetailDtoList = loadingBucketService.list(queryParam);
        if (bucketDetailDtoList != null && bucketDetailDtoList.size() > 0) {
            return CommonResult.success(bucketDetailDtoList.get(0));
        } else {
          return CommonResult.success(new OmsOrderLoadingResult());
        }
    }

    @ApiOperation("显示某个桶位货物详情")
    @RequestMapping(value = "/goodsDetail/{id}", method = RequestMethod.GET)
    private CommonResult<OmsBucketDetailDto> getGoodsDetail(@PathVariable("id") Long goodsDetailId) {
        OmsBucketDetailDto bucketDetailDto = loadingBucketService.info(goodsDetailId);
        return CommonResult.success(bucketDetailDto);
    }

    @ApiOperation("查询客户订单未配载信息")
    @RequestMapping(value = "/getUnLoadingGoods", method = RequestMethod.POST)
    private CommonResult<OmsUnpackingGoodsResult> getUnLoadingGoods(@RequestBody OmsUnLoadingGoodsQueryParam param) {
        OmsUnpackingGoodsResult unpackingGoodsResult = loadingBucketService.getUnLoadingGoods(param);
        if (unpackingGoodsResult == null) {
            unpackingGoodsResult = new OmsUnpackingGoodsResult();
        }
        return CommonResult.success(unpackingGoodsResult);
    }

    @ApiOperation("装载确认")
    @RequestMapping(value = "/confirm/loading", method = RequestMethod.POST)
    private CommonResult loadingConfirm(@RequestParam("id") Long goodsDetailId, @RequestParam("state") Integer isConfirm) {
        int count = loadingBucketService.loadingConfirm(goodsDetailId, isConfirm);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("派货确认")
    @RequestMapping(value = "/confirm/sending", method = RequestMethod.POST)
    private CommonResult sendingConfirm(@RequestParam("id") Long goodsDetailId, @RequestParam("state") Integer isConfirm, @RequestParam("remark") String remark) {
        int count = loadingBucketService.sendingConfirm(goodsDetailId, isConfirm, remark);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("生成报关单，更改状态")
    @RequestMapping(value = "/genCustDeclaration/{id}", method = RequestMethod.POST)
    private CommonResult genCustDeclaration(@PathVariable("id") Long orderLoadingId) {
        int count = loadingBucketService.genCustDeclaration(orderLoadingId);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("获取报关单")
    @RequestMapping(value = "/getCustDeclarationInfo/{id}", method = RequestMethod.GET)
    private CommonResult<List<OmsGoodsExportResult>> getCustDeclarationInfo(@PathVariable("id") Long orderLoadingId) {
        List<OmsGoodsExportResult> result = loadingBucketService.getCustDeclarationInfo(orderLoadingId);
        return CommonResult.success(result);
    }

    @ApiOperation("客户维度结单账单")
    @RequestMapping(value = "/settlement/cust", method = RequestMethod.POST)
    private CommonResult<List<OmsSettlementResult>> custSettlementList(@RequestBody OmsBucketDetailQueryParam queryParam) {
        List<OmsSettlementResult> result = loadingBucketService.getCustSettlement(queryParam);
        return CommonResult.success(result);
    }

    @ApiOperation("车辆维度结单账单")
    @RequestMapping(value = "/settlement/vechile", method = RequestMethod.POST)
    private CommonResult<List<OmsSettlementResult>> vechileSettlementList(@RequestBody OmsBucketDetailQueryParam queryParam) {
        List<OmsSettlementResult> result = loadingBucketService.getVechileSettlement(queryParam);
        return CommonResult.success(result);
    }

    @ApiOperation("首页今日统计")
    @RequestMapping(value = "/summary/goods", method = RequestMethod.POST)
    private CommonResult<List<OmsBucketGoodsDetail>> getCurrSummary(@RequestParam String currDate) {
        List<OmsBucketGoodsDetail> result = loadingBucketService.getCurrSummary(currDate);
        return CommonResult.success(result);
    }

    @ApiOperation("首页统计每天发货曲线")
    @RequestMapping(value = "/summary/week", method = RequestMethod.POST)
    private CommonResult<List<OmsLoadingWeekSummaryResult>> getLastWeekSummary(@RequestParam String currDate) {
        List<OmsLoadingWeekSummaryResult> result = loadingBucketService.getLastWeekSummary(currDate);
        return CommonResult.success(result);
    }
}