package com.newcore.electronic.commerce.commodity.cache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 电商平台-商品缓存服务-主启动类
 * @author zhouchaowei
 * @date 2022-07-09
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ElectronicCommerceCommodityCacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElectronicCommerceCommodityCacheApplication.class,args);
    }
}
