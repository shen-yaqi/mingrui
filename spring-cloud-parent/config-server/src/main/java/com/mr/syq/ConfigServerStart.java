package com.mr.syq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @ClassName ConfigServerStart
 * @Description: TODO
 * @Author shenyaqi
 * @Date 2020/7/27
 * @Version V1.0
 **/
@SpringBootApplication
@EnableConfigServer
public class ConfigServerStart {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerStart.class);
    }
}
