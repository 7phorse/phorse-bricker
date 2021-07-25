package com.phorse.bricker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.oas.annotations.EnableOpenApi;

@EnableOpenApi
@SpringBootApplication(scanBasePackages = "com.phorse.bricker")
public class BrickerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BrickerApplication.class, args);
    }

}
