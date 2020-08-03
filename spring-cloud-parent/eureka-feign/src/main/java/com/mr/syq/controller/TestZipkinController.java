package com.mr.syq.controller;

import com.mr.syq.service.TestEurekaFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestZipkinController
 * @Description: TODO
 * @Author shenyaqi
 * @Date 2020/8/3
 * @Version V1.0
 **/
@RestController
@RequestMapping(value = "eureka-feign-zipkin-controller")
public class TestZipkinController {

    private TestEurekaFeignService service;

    @Autowired
    public void setService(TestEurekaFeignService service) {
        this.service = service;
    }

    @GetMapping(value = "/method1")
    public String method1(){

        service.method();

        return "method1";
    }
    @GetMapping(value = "/method2")
    public String method2(){

        return "method2";
    }
}
