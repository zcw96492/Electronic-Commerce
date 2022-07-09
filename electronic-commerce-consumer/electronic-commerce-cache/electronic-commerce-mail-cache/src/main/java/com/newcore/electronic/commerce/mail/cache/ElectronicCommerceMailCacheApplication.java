package com.newcore.electronic.commerce.mail.cache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 电商平台-邮件缓存服务-主启动类
 * @author zhouchaowei
 * @date 2022-07-09
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ElectronicCommerceMailCacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElectronicCommerceMailCacheApplication.class,args);
    }
}
