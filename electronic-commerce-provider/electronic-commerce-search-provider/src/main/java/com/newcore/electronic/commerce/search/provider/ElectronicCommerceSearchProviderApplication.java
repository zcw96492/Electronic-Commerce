package com.newcore.electronic.commerce.search.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 电商平台-搜索服务-主启动类
 * @author zhouchaowei
 * @date 2022-07-08
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ElectronicCommerceSearchProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElectronicCommerceSearchProviderApplication.class,args);
    }
}
