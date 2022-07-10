package com.newcore.electronic.commerce.payment.batch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 电商平台-支付批作业服务-主启动类
 * @author zhouchaowei
 * @date 2022-07-10
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ElectronicCommercePaymentBatchApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElectronicCommercePaymentBatchApplication.class,args);
    }
}
