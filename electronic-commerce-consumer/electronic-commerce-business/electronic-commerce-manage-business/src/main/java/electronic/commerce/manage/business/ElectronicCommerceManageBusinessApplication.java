package electronic.commerce.manage.business;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 电商平台-后台管理服务-主启动类
 * @author zhouchaowei
 * @date 2022-07-11
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ElectronicCommerceManageBusinessApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElectronicCommerceManageBusinessApplication.class, args);
    }
}
