package org.wyt.study.springcloudclientribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
//@EnableDiscoveryClient
@EnableEurekaClient
@EnableFeignClients
@ComponentScan
public class SpringcloudClientRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudClientRibbonApplication.class, args);
    }

    @LoadBalanced
    @Bean(name="rest")
    RestTemplate rest() {
        return new RestTemplate();
    }
}
