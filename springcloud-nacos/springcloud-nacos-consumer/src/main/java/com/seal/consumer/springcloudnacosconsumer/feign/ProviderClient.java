package com.seal.consumer.springcloudnacosconsumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author fengzhiqiang
 * @date-time 2020/4/2-15:22
 **/
@FeignClient("nacos-provider")
public interface ProviderClient {

    @GetMapping("/hi")
    String hi(@RequestParam(value = "name", defaultValue = "fengzhiqiang", required = false) String name);
}
