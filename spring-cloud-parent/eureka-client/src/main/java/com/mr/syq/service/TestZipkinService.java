package com.mr.syq.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "EUREKA-FEIGN")
public interface TestZipkinService {

    @GetMapping(value = "eureka-feign-zipkin-controller/method2",
    consumes = MediaType.APPLICATION_JSON_VALUE,
    produces = MediaType.APPLICATION_JSON_VALUE)
    String method2();

}
