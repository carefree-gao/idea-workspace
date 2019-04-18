package com.example.feign;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {


    @Autowired FeignService rservice;

    @RequestMapping(value = "/feign",method = RequestMethod.GET)
    public String toString() {
        return rservice.sayhellow();
    }
}
