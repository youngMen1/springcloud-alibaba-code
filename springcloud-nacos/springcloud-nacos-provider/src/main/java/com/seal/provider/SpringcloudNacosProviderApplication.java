package com.seal.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
/**
 * @author zhiqiang.feng
 * @version 1.0
 * @date-time 2019/02/13-11:01
 * @description 服务注册和发现组件
 **/
@EnableDiscoveryClient
@SpringBootApplication
public class SpringcloudNacosProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudNacosProviderApplication.class, args);
    }

}
