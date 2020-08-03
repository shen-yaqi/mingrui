package com.mr.syq.controller;

import com.mr.syq.service.TestZipkinService;
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
@RequestMapping(value = "eureka-client-zipkin-controller")
public class TestZipkinController {

    private TestZipkinService service;

    @Autowired
    public void setService(TestZipkinService service) {
        this.service = service;
    }

    @GetMapping
    public String method(){

        service.method2();

        return "method";
    }

}
