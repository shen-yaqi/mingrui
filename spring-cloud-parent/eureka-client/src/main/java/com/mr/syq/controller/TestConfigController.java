package com.mr.syq.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestConfigController
 * @Description: TODO
 * @Author shenyaqi
 * @Date 2020/8/3
 * @Version V1.0
 **/
@RestController
@RequestMapping(value = "config-client-controller")
public class TestConfigController {

    @Value(value = "${mingrui.url}")
    private String url;

    @GetMapping
    public String test(){
        return "从config-server读取内容--> " + url;
    }

}
