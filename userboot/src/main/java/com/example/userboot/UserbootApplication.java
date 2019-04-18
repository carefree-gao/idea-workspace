package com.example.userboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UserbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserbootApplication.class, args);
    }

}
