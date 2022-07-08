package com.newcore.electronic.commerce.monitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 电商平台-监控模块-主启动类
 * @author zhouchaowei
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ElectronicCommerceMonitorApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElectronicCommerceMonitorApplication.class);
    }
}
