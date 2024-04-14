package com.macro.mall.controller;

import com.macro.mall.common.api.CommonPage;
import com.macro.mall.common.api.CommonResult;
import com.macro.mall.dto.OmsCustOrderDto;
import com.macro.mall.dto.OmsCustOrderQueryParam;
import com.macro.mall.dto.OmsCustOrderSettlementResult;
import com.macro.mall.model.OmsCustOrder;
import com.macro.mall.service.OmsCustOrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * 客户订单Controller
 */
@Controller
@ResponseBody
@Api(tags = "OmsCustOrderController")
@Tag(name = "OmsCustOrderController", description = "客户订单")
@RequestMapping("/custOrder")
public class OmsCustOrderController {
    @Autowired
    OmsCustOrderService custOrderService;

    @ApiOperation("创建客户订单")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public CommonResult create(@Valid @RequestBody OmsCustOrderDto custOrderDto) {
        int count = custOrderService.create(custOrderDto);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("查询客户订单")
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public CommonResult<CommonPage<OmsCustOrder>> list(OmsCustOrderQueryParam queryParam,
                                                       @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize,
                                                       @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<OmsCustOrder> omsCustOrderList = custOrderService.listPage(queryParam, pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(omsCustOrderList));
    }

    @ApiOperation("客户订单详情")
    @RequestMapping(value = "/info/{id}", method = RequestMethod.GET)
    public CommonResult<OmsCustOrder> info(@PathVariable Long id) {
        OmsCustOrder omsCustOrder = custOrderService.info(id);
        return CommonResult.success(omsCustOrder);
    }

    @ApiOperation("取消客户订单")
    @RequestMapping(value = "/cancel", method = RequestMethod.POST)
    public CommonResult cancel(@RequestParam(value = "id") Long id, @RequestParam(value = "remark") String remark) {
        int count = custOrderService.cancel(id, remark);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("更新客户订单")
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public CommonResult update(@RequestBody OmsCustOrder custOrder) {
        int count = custOrderService.update(custOrder);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("客户结算单统计查询")
    @RequestMapping(value = "/settlementlist", method = RequestMethod.GET)
    public CommonResult<CommonPage<OmsCustOrderSettlementResult>> settlementList(OmsCustOrderQueryParam queryParam) {
        List<OmsCustOrderSettlementResult> settlementResultList = custOrderService.settlementList(queryParam);
        return CommonResult.success(CommonPage.restPage(settlementResultList));
    }
}
