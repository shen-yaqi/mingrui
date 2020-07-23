package com.mr.syq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName EurekaServerStart
 * @Description: TODO
 * @Author shenyaqi
 * @Date 2020/7/23
 * @Version V1.0
 **/
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerStart {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerStart.class);
    }
}
