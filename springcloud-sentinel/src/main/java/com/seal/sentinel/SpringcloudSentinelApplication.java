package com.seal.sentinel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * @author zhiqiang.feng
 * @version 1.0
 * @date-time 2019/02/13-11:01
 * @description Sentinel 流量控制、熔断降级
 **/
@SpringBootApplication
public class SpringcloudSentinelApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudSentinelApplication.class, args);
    }

}
