package com.seal.consumer.springcloudnacosconsumer.controller;

import com.seal.consumer.springcloudnacosconsumer.feign.ProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fengzhiqiang
 * @date-time 2020/4/2-15:24
 **/
@RestController
public class TestController {

    @Autowired
    ProviderClient providerClient;

    @GetMapping("/hi-feign")
    public String hiFeign() {
        return providerClient.hi("fengzhiqiang");
    }
}
