package com.wei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ZuulGatewayApplication9501 {
    public static void main(String[] args) {
        SpringApplication.run(ZuulGatewayApplication9501.class, args);
    }
}
