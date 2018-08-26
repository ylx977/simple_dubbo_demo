package com.fuzamei.dubboprovider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.fuzamei.dubboapi.consumer.DemoService;
import com.fuzamei.dubboapi.pojo.TestBO;
import com.fuzamei.dubboapi.pojo.User;
import com.fuzamei.dubboapi.pojo.UserDO;
import com.fuzamei.dubboprovider.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ylx
 * Created by fuzamei on 2018/8/26.
 */
@Service(version = "1.0.0")
public class TestServiceImpl implements DemoService {

    @Autowired
    private UserMapper userMapper;

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

    @Override
    public UserDO findUserQuery(TestBO testBO) {
        Long id = testBO.getId();
        System.out.println("id="+id);
        UserDO userById = userMapper.findUserById(id);
        System.out.println(userById);
        return userById;
    }
}
