package com.phorse.bricker.model.jackson;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * JsonInclude介绍：
 * ALWAYS // 默认策略，任何情况都执行序列化
 * NON_NULL // 非空
 * NON_ABSENT // null的不会序列化，但如果类型是AtomicReference，依然会被序列化
 * NON_EMPTY // null、集合数组等没有内容、空字符串等，都不会被序列化
 * NON_DEFAULT // 如果字段是默认值，就不会被序列化
 * CUSTOM // 此时要指定valueFilter属性，该属性对应一个类，用来自定义判断被JsonInclude修饰的字段是否序列化
 * USE_DEFAULTS // 当JsonInclude在类和属性上都有时，优先使用属性上的注解，此时如果在序列化的get方法上使用了JsonInclude，并设置为USE_DEFAULTS，就会使用类注解的设置
 *
 * @author luoxusheng 2021/7/25 22:42
 * @version v1.0.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class JsonIncludeObject {

    @JsonInclude()
    private String always;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String nonNull;
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    private String nonAbsent;
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String nonEmpty;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private String nonDefault;
    @JsonInclude(JsonInclude.Include.CUSTOM)
    private String custom;
    @JsonInclude(JsonInclude.Include.USE_DEFAULTS)
    private String useDefaults;
}
