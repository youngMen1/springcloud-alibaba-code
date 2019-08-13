package com.seal.sentinel.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.web.bind.annotation.*;

/**
 * @author zhiqiang.feng
 * @version 1.0
 * @date-time 2019/8/13 14:52
 * @description
 **/
@RestController
public class TestController {

    @GetMapping("/hi")
    @SentinelResource(value = "hi")
    public String hi(@RequestParam(value = "name", defaultValue = "forezp", required = false) String name) {

        return "hi " + name;
    }


}
