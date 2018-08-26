package com.fuzamei.dubboconsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import consumer.DemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pojo.User;

/**
 * @author ylx
 * Created by fuzamei on 2018/8/25.
 */
@RestController
@RequestMapping("/")
public class DemoConsumerController {

    @Reference(version = "1.0.0")
    private DemoService demoService;

    @RequestMapping("/hello")
    public String hello() {
        return demoService.sayHello("Hello springboot and dubbo!");
    }

    @RequestMapping("/user")
    public User user() {
        return demoService.findUser();
    }
}
