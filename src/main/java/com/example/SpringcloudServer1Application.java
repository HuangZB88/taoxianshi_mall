package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka注册中心启动类
 * 对此要注册
 * 团队成员在此处新加一个功能点，要注意！@huangzibo
 * huangzibo在这里新加了广告营销功能
 */
@SpringBootApplication
@EnableEurekaServer
public class SpringcloudServer1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudServer1Application.class, args);
    }

}
