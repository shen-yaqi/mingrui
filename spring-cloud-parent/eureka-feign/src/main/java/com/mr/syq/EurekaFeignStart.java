package com.mr.syq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName EurekaFeignStart
 * @Description: TODO
 * @Author shenyaqi
 * @Date 2020/7/23
 * @Version V1.0
 **/
@SpringBootApplication
@EnableFeignClients//声明当前服务是一个feign客户端,同时扫描FeignClient接口
public class EurekaFeignStart {

    public static void main(String[] args) {
        SpringApplication.run(EurekaFeignStart.class);
    }
}
