package com.wuyifan.eurekecenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekecenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekecenterApplication.class, args);
    }

}
