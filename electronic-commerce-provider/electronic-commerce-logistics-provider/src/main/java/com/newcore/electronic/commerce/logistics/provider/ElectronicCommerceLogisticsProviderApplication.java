package com.newcore.electronic.commerce.logistics.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 电商平台-物流服务-主启动类
 * @author zhouchaowei
 * @date 2022-07-06
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ElectronicCommerceLogisticsProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElectronicCommerceLogisticsProviderApplication.class,args);
    }
}
