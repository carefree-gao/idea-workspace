package com.example.ribbonnew2;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RibbonNew2Service {


    @Autowired
    RestTemplate restTemplate;


    @HystrixCommand(fallbackMethod = "fallback")
    public String hellowRibbon() {
        return restTemplate.getForObject("http://COSUMER/hello",String.class);
    }



    public String fallback(){
        return "ni hao wo shi back! 你好我是返回函数！";
    }
}
