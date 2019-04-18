package com.example.ribbon;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class RibbonService {

    @Autowired
    RestTemplate restTemplate;


    //这个对象可以获取出来服务的一些信息
    @Autowired
    private DiscoveryClient discoveryClient;

    public String hellowService(String name) {



        List<ServiceInstance> instances = discoveryClient.getInstances("COSUMER");
        String a = null;
        for(ServiceInstance s:instances){
            a = s.getUri().toString();
        }
        System.out.print(a);
        //一种直接写访问路径,另一种是写服务名称
        //使用名称形式的话需要在RestTemplate上加@LoadBalanced开启ribbon负载均衡器
        //String forObject = restTemplate.getForObject("http://consul-member/getMember", String.class);
        //String forObject = restTemplate.getForObject("http://192.168.244.1:8000/getMember", String.class); 一般不直接写地址
        String forObject = restTemplate.getForObject("http://DESKTOP-1EOQ7KF/hello", String.class);
        return forObject;
       // return restTemplate.getForObject("http://COSUMER/hello",String.class);
    }
}
