package com.mr.syq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName ConfigServerStart
 * @Description: TODO
 * @Author shenyaqi
 * @Date 2020/7/27
 * @Version V1.0
 **/

@SpringBootApplication
@EnableConfigServer//声明当前服务是一个configserver
@EnableEurekaClient//将当前服务注册到eureka服务中,高可用
public class ConfigServerStart {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerStart.class);
    }
}
