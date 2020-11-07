package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.ApplicationContext;

/**
 * @author wangtao
 * @date 2020/6/28 17:04
 * @desc
 */
@SpringBootApplication
@EnableEurekaServer
public class EureKaMain7001 {
    public static void main(String[] args) {
        SpringApplication.run(EureKaMain7001.class,args);
    }
}
