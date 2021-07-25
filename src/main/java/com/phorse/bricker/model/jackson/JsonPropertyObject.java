package com.phorse.bricker.model.jackson;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * JsonProperty注解测试对象
 *
 * @author luoxusheng 2021/7/25 23:23
 * @version v1.0.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class JsonPropertyObject {

    @JsonProperty(value = "json_field0")
    private String field0;

    private String field1;
}
