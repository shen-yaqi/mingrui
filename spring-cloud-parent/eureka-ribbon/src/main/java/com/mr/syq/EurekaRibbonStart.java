package com.mr.syq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName EurekaRibbonStart
 * @Description: TODO
 * @Author shenyaqi
 * @Date 2020/7/23
 * @Version V1.0
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient//声明当前服务可以调用注册到eureka的服务
@EnableHystrix
public class EurekaRibbonStart {

    public static void main(String[] args) {
        SpringApplication.run(EurekaRibbonStart.class);
    }

    @Bean
    @LoadBalanced//@LoadBalanced注解修饰的RestTemplate对象向外发起HTTP请求时，会被LoadBalancerInterceptor类的intercept方法拦截，在这个方法中直接通过getHost方法就可以获取到服务名（因为我们在使用RestTemplate调用服务的时候，使用的是服务名而不是域名，所以这里可以通过getHost直接拿到服务名然后去调用execute方法发起请求)
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
