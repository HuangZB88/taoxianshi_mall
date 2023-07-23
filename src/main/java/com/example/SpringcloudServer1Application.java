package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 启动类
 */
@SpringBootApplication
@EnableEurekaServer
public class SpringcloudServer1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudServer1Application.class, args);
    }

}
