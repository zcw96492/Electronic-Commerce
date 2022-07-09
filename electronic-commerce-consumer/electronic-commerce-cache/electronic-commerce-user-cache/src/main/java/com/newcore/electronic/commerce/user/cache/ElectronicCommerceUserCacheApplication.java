package com.newcore.electronic.commerce.user.cache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 电商平台-用户缓存服务-主启动类
 * @author zhouchaowei
 * @date 2022-07-09
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ElectronicCommerceUserCacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElectronicCommerceUserCacheApplication.class,args);
    }
}
