package com.newcore.electronic.commerce.logistics.cache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 电商平台-物流缓存服务-主启动类
 * @author zhouchaowei
 * @date 2022-07-09
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ElectronicCommerceLogisticsCacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElectronicCommerceLogisticsCacheApplication.class,args);
    }
}
