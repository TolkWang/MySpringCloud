package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author wangtao
 * @date 2020/6/28 17:34
 * @desc
 */
@SpringBootApplication
@EnableEurekaServer
public class EureKaMain7002 {
    public static void main(String[] args) {
        SpringApplication.run(EureKaMain7002.class,args);
    }
}
