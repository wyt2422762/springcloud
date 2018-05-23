package org.wyt.study.springcloudservice1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class SpringcloudService1Application {
    @Value("${server.port}")
    private String port;

    @RequestMapping("/hi")
    public String hi(@RequestParam(name="name") String str) {
        return "Hi " + str + " ,from port: " + port;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudService1Application.class, args);
    }
}
