package com.mr.syq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @ClassName EurekaZuulStart
 * @Description: TODO
 * @Author shenyaqi
 * @Date 2020/7/24
 * @Version V1.0
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy//启用zuul
public class EurekaZuulStart {

    public static void main(String[] args) {
        SpringApplication.run(EurekaZuulStart.class);
    }
}
