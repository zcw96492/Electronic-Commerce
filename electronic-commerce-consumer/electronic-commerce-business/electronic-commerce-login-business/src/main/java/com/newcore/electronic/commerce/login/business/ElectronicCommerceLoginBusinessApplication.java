package com.newcore.electronic.commerce.login.business;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 电商平台-商品缓存服务-主启动类
 * @author zhouchaowei
 * @date 2022-07-11
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ElectronicCommerceLoginBusinessApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElectronicCommerceLoginBusinessApplication.class, args);
    }
}
