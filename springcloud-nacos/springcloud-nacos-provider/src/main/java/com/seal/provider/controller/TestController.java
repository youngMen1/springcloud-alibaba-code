package com.seal.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhiqiang.feng
 * @version 1.0
 * @date-time 2019/8/13 14:32
 * @description
 **/
@RestController
public class TestController {

    @GetMapping("/hi")
    public String hello(@RequestParam(value = "name", defaultValue = "fengzhiqiang", required = false) String name) {

        return "hi " + name;
    }

}
