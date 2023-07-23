package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka注册中心启动类
 * 对此要注册
 */
@SpringBootApplication
@EnableEurekaServer
public class SpringcloudServer1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudServer1Application.class, args);
    }

}
