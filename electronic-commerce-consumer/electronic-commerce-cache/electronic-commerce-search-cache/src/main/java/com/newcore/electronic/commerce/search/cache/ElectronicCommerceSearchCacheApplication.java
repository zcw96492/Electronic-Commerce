package com.newcore.electronic.commerce.search.cache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 电商平台-搜索缓存服务-主启动类
 * @author zhouchaowei
 * @date 2022-07-09
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ElectronicCommerceSearchCacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElectronicCommerceSearchCacheApplication.class,args);
    }
}
