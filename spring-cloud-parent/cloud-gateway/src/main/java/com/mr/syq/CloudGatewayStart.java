package com.mr.syq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName CloudGatewayStart
 * @Description: TODO
 * @Author shenyaqi
 * @Date 2020/8/4
 * @Version V1.0
 **/
@SpringBootApplication
public class CloudGatewayStart {

    public static void main(String[] args) {
        SpringApplication.run(CloudGatewayStart.class);
    }

}
