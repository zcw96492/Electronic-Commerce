package com.newcore.electronic.commerce.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 电商平台-网关路由模块-主启动类
 * @author zhouchaowei
 * @date 2022-07-09
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class ElectronicCommerceGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElectronicCommerceGatewayApplication.class,args);
    }
}
