package com.mr.syq.gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName GatewayConfig
 * @Description: TODO
 * @Author shenyaqi
 * @Date 2020/8/4
 * @Version V1.0
 **/
@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator syqRoute(RouteLocatorBuilder builder){

        return builder.routes()
                .route("path-route",r -> r.path("/feign-api/**")
                        .filters(f -> f.stripPrefix(1))
                        .uri("http://localhost:8765"))
                .build();
    }

}
