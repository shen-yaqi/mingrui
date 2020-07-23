package com.mr.syq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName TestEurekaRibbonController
 * @Description: TODO
 * @Author shenyaqi
 * @Date 2020/7/23
 * @Version V1.0
 **/
@RestController
@RequestMapping(value = "eureka-ribbon")
public class TestEurekaRibbonController {

    private RestTemplate restTemplate;

    @Autowired
    public void setRestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping
    public String test(String name){

        //http://eureka客户端服务名/模块名
        String url = "http://EUREKA-CLIENT/eureka-client?name=" + name;
        String forObject = restTemplate.getForObject(url, String.class);
        return forObject;
    }
}
