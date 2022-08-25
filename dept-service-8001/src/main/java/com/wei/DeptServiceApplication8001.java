package com.wei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.wei.dao")
@EnableEurekaClient
@EnableDiscoveryClient
public class DeptServiceApplication8001 {
    public static void main(String[] args) {
        SpringApplication.run(DeptServiceApplication8001.class, args);
    }
}
