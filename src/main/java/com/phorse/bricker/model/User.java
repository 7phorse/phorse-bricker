package com.phorse.bricker.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * @author luoxusheng 2021/4/12 16:05
 * @version v1.0.0
 */
@Data
@Builder
@Document(collection = "user")
public class User {

    private String userName;

    private String password;

    private List<String> topics;

    private Integer age;

    private String birthday;
}
