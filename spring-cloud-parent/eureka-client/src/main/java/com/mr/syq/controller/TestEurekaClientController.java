package com.mr.syq.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestEurekaClientController
 * @Description: TODO
 * @Author shenyaqi
 * @Date 2020/7/23
 * @Version V1.0
 **/
@RestController
@RequestMapping(value = "eureka-client")
public class TestEurekaClientController {

    @GetMapping
    public String test(String name){

        System.out.println("=====================");
        return "eureka-client : " + name;
    }

}
