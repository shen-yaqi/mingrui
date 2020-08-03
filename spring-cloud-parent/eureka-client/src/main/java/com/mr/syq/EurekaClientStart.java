package com.mr.syq;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

/**
 * @ClassName EurekaClientStart
 * @Description: TODO
 * @Author shenyaqi
 * @Date 2020/7/23
 * @Version V1.0
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients//声明当前服务是一个feign客户端,同时扫描FeignClient接口
@EnableCircuitBreaker//启用断路器
@EnableHystrixDashboard//启用断路器可视化
public class EurekaClientStart {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientStart.class,args);
    }

    /**
     * boot2.x版本需要声明监控可视化的路径
     * @return
     */
    @Bean
    public ServletRegistrationBean hystrixMetricsStreamServlet() {
        ServletRegistrationBean registration = new ServletRegistrationBean(new HystrixMetricsStreamServlet());
        registration.setLoadOnStartup(1);
        registration.addUrlMappings("/actuator/hystrix.stream");
        registration.setName("HystrixMetricsStreamServlet");
        return registration;
    }
}
