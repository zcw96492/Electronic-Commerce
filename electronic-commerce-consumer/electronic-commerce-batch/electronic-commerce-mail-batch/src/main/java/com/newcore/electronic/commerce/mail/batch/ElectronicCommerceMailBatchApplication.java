package com.newcore.electronic.commerce.mail.batch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 电商平台-邮件批作业服务-主启动类
 * @author zhouchaowei
 * @date 2022-07-10
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ElectronicCommerceMailBatchApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElectronicCommerceMailBatchApplication.class,args);
    }
}
