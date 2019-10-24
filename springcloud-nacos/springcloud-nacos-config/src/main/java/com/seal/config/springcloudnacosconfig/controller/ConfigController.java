package com.seal.config.springcloudnacosconfig.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhiqiang.feng
 * @version 1.0
 * @date-time 2019/10/24 09:32
 * @description
 * @RefreshScope 实现配置的热加载
 **/
@RestController
@RefreshScope
public class ConfigController {

    @Value("${username:lily}")
    private String username;

    @RequestMapping("/username")
    public String get() {
        return username;
    }
}
