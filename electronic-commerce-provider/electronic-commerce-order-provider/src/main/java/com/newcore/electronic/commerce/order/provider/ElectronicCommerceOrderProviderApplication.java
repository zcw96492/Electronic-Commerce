package com.newcore.electronic.commerce.order.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 电商平台-订单服务-主启动类
 * @author zhouchaowei
 * @date 2022-07-08
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ElectronicCommerceOrderProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElectronicCommerceOrderProviderApplication.class,args);
    }
}
