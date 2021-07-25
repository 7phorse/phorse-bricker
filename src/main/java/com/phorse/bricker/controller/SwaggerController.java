package com.phorse.bricker.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Swagger测试Controller
 *
 * @author luoxusheng 2021/7/25 16:40
 * @version v1.0.0
 */
@Slf4j
@RestController
@RequestMapping("swagger")
@Api(value = "swagger", tags = "Swagger整合测试")
public class SwaggerController {

    @GetMapping("test")
    @ApiOperation(value = "这是测试方法")
    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "Long", name = "param1", value = "测试参数1"),
    })
    public String test(@RequestParam(required = false, value = "param1") Long param) {
        return "ok";
    }
}
