package com.example.ribbon;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class RibbonControler {


    @Autowired
    RibbonService ribbonService;
    @RequestMapping(value = "/ni")
    public String hi(@RequestParam String name){
        return ribbonService.hellowService(name);
    }





    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("/client")
    public String home(@RequestParam String name) {

        List<Map<String, Object>> list = new ArrayList<>();
        Map<String, Object> map = new HashMap<>(16);

        List<String> stringList = discoveryClient.getServices();
        stringList.forEach(str -> {
            List<ServiceInstance> serviceInstances = discoveryClient.getInstances(str);
            serviceInstances.forEach(ins -> {
                map.put("host", ins.getHost());
                map.put("port", ins.getPort());
                map.put("serviceId", ins.getServiceId());
                map.put("uri", ins.getUri());
                list.add(map);
            });
        });

        String url = null;

        for (Map<String, Object> m : list) {
            for (String k : m.keySet()) {
                url = "欢迎点击:  "+m.get("uri") + "/client?name=" + name;
            }
        }
        return url;
    }









}
