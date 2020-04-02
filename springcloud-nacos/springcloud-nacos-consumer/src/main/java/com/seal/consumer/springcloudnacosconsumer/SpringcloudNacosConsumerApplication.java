package com.seal.consumer.springcloudnacosconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author zhiqiang.feng
 * @version 1.0
 * @date-time 2019/02/13-11:01
 * @description
 **/
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class SpringcloudNacosConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudNacosConsumerApplication.class, args);
    }

}
