package com.mr.syq.controller;

import com.mr.syq.entity.UserEntity;
import com.mr.syq.service.TestEurekaFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName TestEurekaFeignController
 * @Description: TODO
 * @Author shenyaqi
 * @Date 2020/7/23
 * @Version V1.0
 **/
@RestController
@RequestMapping(value = "eureka-feign")
public class TestEurekaFeignController {

    private TestEurekaFeignService service;

    @Autowired
    public void setService(TestEurekaFeignService service) {
        this.service = service;
    }

    @GetMapping
    public String test(UserEntity entity){

        return service.test(entity);
    }

    @PostMapping
    public String testPost(@RequestBody UserEntity entity){
        String s = service.testPost(entity);
        return s;
    }

    @PutMapping
    public String testPut(@RequestBody UserEntity entity){
        String s = service.testPut(entity);
        return s;
    }

    @DeleteMapping
    public String testDel(String ids){
        String s = service.testDel(ids);
        return s;
    }
}
