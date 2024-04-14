package com.macro.mall.controller;

import com.macro.mall.common.api.CommonResult;
import com.macro.mall.common.consts.SysEnumEnum;
import com.macro.mall.dto.SysEnumQueryParam;
import com.macro.mall.model.SysEnum;
import com.macro.mall.service.SysEnumService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * 系统枚举Controller
 */
@Controller
@ResponseBody
@Api(tags = "SysEnumControl")
@Tag(name = "SysEnumControl", description = "系统枚举")
@RequestMapping("/sysEnum")
public class SysEnumControl {
    @Autowired
    SysEnumService sysEnumService;

    @ApiOperation("获取枚举数据列表")
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public CommonResult<List<SysEnum>> listByType(@Valid SysEnumQueryParam queryParam) {
        List<SysEnum> list = sysEnumService.listEnumByType(queryParam);
        return CommonResult.success(list);
    }

    @ApiOperation("获取某个枚举数据")
    @RequestMapping(value = "/getByCode",method = RequestMethod.GET)
    public CommonResult<SysEnum> getEnumByType(@ApiParam("枚举类型") @RequestParam("enumType") String enumType, @ApiParam("枚举编码") @RequestParam("enumCode") String enumCode) {
        SysEnum sysEnum = sysEnumService.getEnumByCode(enumType, enumCode);
        return CommonResult.success(sysEnum);
    }

    @ApiOperation("获取某个枚举数据")
    @RequestMapping(value = "/getByValue",method = RequestMethod.GET)
    public CommonResult<SysEnum> getEnumByValue(@ApiParam("枚举类型") @RequestParam("enumType") String enumType, @ApiParam("枚举值") @RequestParam("enumValue") String enumValue) {
        SysEnum sysEnum = sysEnumService.getEnumByValue(enumType, enumValue);
        return CommonResult.success(sysEnum);
    }

    @ApiOperation("创建枚举数据")
    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public CommonResult create(@RequestBody SysEnum sysEnum) {
        int count = sysEnumService.create(sysEnum);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("更新枚举数据")
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public CommonResult update(@RequestBody SysEnum sysEnum) {
        int count = sysEnumService.update(sysEnum);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

}

