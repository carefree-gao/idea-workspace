package com.example.feign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "COSUMER")
public interface FeignService {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    String sayhellow();
}
