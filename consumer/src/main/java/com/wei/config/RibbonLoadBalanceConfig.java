package com.wei.config;

import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.PingUrl;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;

public class RibbonLoadBalanceConfig {

    @Bean
    public IRule rule(){
        //定义负载均衡策略
        return new RandomRule();
    }

    @Bean
    public IPing ping(){
        return new PingUrl();
    }
}
