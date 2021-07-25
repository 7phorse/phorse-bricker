package com.phorse.bricker.controller;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.phorse.bricker.model.jackson.JsonIncludeObject;
import com.phorse.bricker.model.jackson.JsonPropertyObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * jackson配置测试Controller
 *
 * @author luoxusheng 2021/7/25 16:32
 * @version v1.0.0
 */
@Slf4j
@RestController
@RequestMapping("jackson")
@Api(value = "swagger", tags = "jackson测试")
public class JacksonController {

    /**
     * ALWAYS // 默认策略，任何情况都执行序列化
     * NON_NULL // 非空
     * NON_ABSENT // null的不会序列化，但如果类型是AtomicReference，依然会被序列化
     * NON_EMPTY // null、集合数组等没有内容、空字符串等，都不会被序列化
     * NON_DEFAULT // 如果字段是默认值，就不会被序列化
     * CUSTOM // 此时要指定valueFilter属性，该属性对应一个类，用来自定义判断被JsonInclude修饰的字段是否序列化
     * USE_DEFAULTS // 当JsonInclude在类和属性上都有时，优先使用属性上的注解，此时如果在序列化的get方法上使用了JsonInclude，并设置为USE_DEFAULTS，就会使用类注解的设置
     *
     * @param jsonIncludeObject jsonIncludeObject
     * @return ResponseEntity
     */
    @PostMapping("json_include")
    @ApiOperation(value = "测试@JsonInclude注解")
    public ResponseEntity<JsonIncludeObject> testJsonInclude(@RequestBody JsonIncludeObject jsonIncludeObject) {
        return ResponseEntity.ok(jsonIncludeObject);
    }


    /**
     * 测试@JsonProperty注解
     *
     * @param jsonPropertyObject jsonPropertyObject
     * @return ResponseEntity
     */
    @PostMapping("json_property")
    @ApiOperation(value = "测试@JsonProperty注解")
    public ResponseEntity<JsonPropertyObject> testJsonProperty(@RequestBody JsonPropertyObject jsonPropertyObject) {
        return ResponseEntity.ok(jsonPropertyObject);
    }

}
