package com.phorse.bricker.controller;

import com.phorse.bricker.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.*;

/**
 * TODO
 *
 * @author luoxusheng 2021/4/12 16:06
 * @version v1.0.0
 */
@Slf4j
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private MongoTemplate mongoTemplate;

    @PostMapping("save")
    public String saveUser(@RequestBody User user) {
        mongoTemplate.save(user);
        return "OK";
    }

    @GetMapping("test")
    public void test(@RequestParam(required = false, value = "uid") Long uid) {
        log.info("uid[{}]", uid);
    }
}
