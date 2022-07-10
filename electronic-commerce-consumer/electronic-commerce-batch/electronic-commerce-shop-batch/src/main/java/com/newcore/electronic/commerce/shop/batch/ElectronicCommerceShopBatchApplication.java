package com.newcore.electronic.commerce.shop.batch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 电商平台-商户批作业服务-主启动类
 * @author zhouchaowei
 * @date 2022-07-10
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ElectronicCommerceShopBatchApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElectronicCommerceShopBatchApplication.class,args);
    }
}
