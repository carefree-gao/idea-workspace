package com.example.ribbonnew2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RibbonNew2Controller {


    @Autowired
    RibbonNew2Service ribbonNew2Service;


    @RequestMapping(value = "/ribbon")
    public String toString() {
        return ribbonNew2Service.hellowRibbon();
    }
}
