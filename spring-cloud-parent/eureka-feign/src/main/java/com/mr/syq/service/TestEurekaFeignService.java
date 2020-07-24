package com.mr.syq.service;

import com.mr.syq.entity.UserEntity;
import com.mr.syq.service.fallback.TestEurekaFeignFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@FeignClient(value = "EUREKA-CLIENT",fallback = TestEurekaFeignFallback.class)//声明当前接口调用的eureka服务 值为服务名称
public interface TestEurekaFeignService {
    //value = eureka服务的方法地址 consumes = 指定请求的数据类型 produces = 指定返回的数据类型
    @GetMapping(value = "eureka-client",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public String test(@RequestParam String name);

    /*spring cloud项目使用feign的时候都会发现一个问题，
        就是get方式无法解析对象参数。
        其实feign是支持对象传递的，但是得是Map形式，而且不能为空
        与spring在机制上不兼容，因此无法使用。
    spring cloud在2.1.x版本中提供了@SpringQueryMap注解，可以传递对象参数，
    框架自动解析，只可惜啊，得是2.1.0以后的版本。*/
    @GetMapping(value = "eureka-client/pojo",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    String test(@SpringQueryMap UserEntity entity);

    @PostMapping(value = "eureka-client", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    String testPost(UserEntity entity);

    @PutMapping(value = "eureka-client", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    String testPut(UserEntity entity);

    @DeleteMapping(value = "eureka-client", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    String testDel(@RequestParam String ids);
}
