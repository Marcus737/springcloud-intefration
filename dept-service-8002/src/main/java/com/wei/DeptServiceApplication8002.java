package com.wei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.wei.dao")
@EnableDiscoveryClient
public class DeptServiceApplication8002 {
    public static void main(String[] args) {
        SpringApplication.run(DeptServiceApplication8002.class, args);
    }
}
