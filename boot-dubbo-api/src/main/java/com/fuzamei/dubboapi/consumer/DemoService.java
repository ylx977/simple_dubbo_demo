package com.fuzamei.dubboapi.consumer;

import com.fuzamei.dubboapi.pojo.TestBO;
import com.fuzamei.dubboapi.pojo.User;
import com.fuzamei.dubboapi.pojo.UserDO;

/**
 * @author ylx
 * Created by fuzamei on 2018/8/25.
 */
public interface DemoService {

    String sayHello(String name);

    User findUser();


    UserDO findUserQuery(TestBO testBO);
}
