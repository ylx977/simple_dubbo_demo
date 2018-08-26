package com.fuzamei.dubboapi.consumer;

import com.fuzamei.dubboapi.pojo.User;

/**
 * @author ylx
 * Created by fuzamei on 2018/8/25.
 */
public interface DemoService {

    String sayHello(String name);

    User findUser();


}
