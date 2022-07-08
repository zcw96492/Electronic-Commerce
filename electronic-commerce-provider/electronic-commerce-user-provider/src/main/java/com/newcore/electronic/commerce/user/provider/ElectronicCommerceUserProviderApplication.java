package com.newcore.electronic.commerce.user.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 电商平台-用户服务-主启动类
 * @author zhouchaowei
 * @date 2022-07-08
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ElectronicCommerceUserProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElectronicCommerceUserProviderApplication.class,args);
    }
}
