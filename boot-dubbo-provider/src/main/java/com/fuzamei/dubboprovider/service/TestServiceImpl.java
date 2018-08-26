package com.fuzamei.dubboprovider.service;

import com.alibaba.dubbo.config.annotation.Service;
import consumer.DemoService;
import pojo.User;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ylx
 * Created by fuzamei on 2018/8/26.
 */
@Service(version = "1.0.0")
public class TestServiceImpl implements DemoService {
    @Override
    public String sayHello(String str) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        return dateFormat.format(new Date()) + ": " + str;
    }

    @Override
    public User findUser() {
        User user = new User();
        user.setId(1001);
        user.setUsername("tom");
        user.setPassword("mouse");
        user.setAge(20);
        user.setGender(0);
        return user;
    }
}
