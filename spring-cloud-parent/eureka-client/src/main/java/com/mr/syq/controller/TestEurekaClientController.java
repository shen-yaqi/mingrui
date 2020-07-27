package com.mr.syq.controller;

import com.mr.syq.entity.UserEntity;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName TestEurekaClientController
 * @Description: TODO
 * @Author shenyaqi
 * @Date 2020/7/23
 * @Version V1.0
 **/
@RestController
@RequestMapping(value = "eureka-client-controller")
public class TestEurekaClientController {

    @GetMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @HystrixCommand(fallbackMethod = "testFallbackMethod")
    public String test(String name){

        System.out.println("=====================");
        return "eureka-client : " + name;
    }

    @GetMapping(value = "pojo", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @HystrixCommand(fallbackMethod = "testFallbackMethod")
    public String test(UserEntity entity){

        System.out.println("=====================" + entity);
        return "success";
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @HystrixCommand(fallbackMethod = "testFallbackMethod")
    public String testPost(@RequestBody UserEntity entity){
        System.out.println(entity);
        return "success";
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @HystrixCommand(fallbackMethod = "testFallbackMethod")
    public String testPut(@RequestBody UserEntity entity){
        System.out.println(entity);
        return "success";
    }

    @DeleteMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @HystrixCommand(fallbackMethod = "testFallbackMethod")
    public String testDelete(String ids){
        System.out.println(ids);
        return ids;
    }


    public String testFallbackMethod(UserEntity entity){
        System.out.println("testFallbackMethod");
        return "testFallbackMethod";
    }

    public String testFallbackMethod(String name){
        System.out.println("testFallbackMethod");
        return "testFallbackMethod";
    }

}
