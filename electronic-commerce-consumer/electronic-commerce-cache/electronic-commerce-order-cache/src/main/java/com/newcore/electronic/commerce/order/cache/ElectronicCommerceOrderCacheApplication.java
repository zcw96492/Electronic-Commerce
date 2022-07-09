package com.newcore.electronic.commerce.order.cache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 电商平台-订单缓存服务-主启动类
 * @author zhouchaowei
 * @date 2022-07-09
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ElectronicCommerceOrderCacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElectronicCommerceOrderCacheApplication.class,args);
    }
}
