package com.newcore.electronic.commerce.shop.cache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 电商平台-商户缓存服务-主启动类
 * @author zhouchaowei
 * @date 2022-07-09
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ElectronicCommerceShopCacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElectronicCommerceShopCacheApplication.class,args);
    }
}
