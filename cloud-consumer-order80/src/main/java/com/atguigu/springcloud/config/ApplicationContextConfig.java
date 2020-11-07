package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author wangtao
 * @date 2020/6/28 14:48
 * @desc RestTemplate配置类
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
    @LoadBalanced //赋予resttemplate负载均衡能力
    public RestTemplate getRestTemplate() {
        return  new RestTemplate();
    }
}
