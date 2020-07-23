package com.mr.syq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName EurekaClientStart
 * @Description: TODO
 * @Author shenyaqi
 * @Date 2020/7/23
 * @Version V1.0
 **/
@SpringBootApplication
@EnableEurekaClient
public class EurekaClientStart {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientStart.class,args);
    }
}
