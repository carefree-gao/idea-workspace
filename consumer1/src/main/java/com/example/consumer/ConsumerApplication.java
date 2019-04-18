package com.example.consumer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@SpringBootApplication
@RestController
public class ConsumerApplication {



    @Value("${server.port:#{null}}")
    private  String port;

    @RequestMapping("/hello")
    String hello() {
        return port+"Hello World!";
    }


    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }


}
