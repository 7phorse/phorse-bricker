package com.phorse.bricker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

@EnableOpenApi
@SpringBootApplication
public class BrickerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BrickerApplication.class, args);
    }

}
