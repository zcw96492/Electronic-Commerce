package com.newcore.electronic.commerce.commodity.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 电商平台-商品服务-主启动类
 * @author zhouchaowei
 * @date 2022-07-06
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ElectronicCommerceCommodityProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElectronicCommerceCommodityProviderApplication.class,args);
    }
}
