package com.fuzamei.dubboprovider2.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.fuzamei.dubboapi.consumer.TxService1;
import com.fuzamei.dubboprovider2.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by fuzamei on 2018/9/13.
 */
@Service(version = "1.0.0")
public class TxService1Impl implements TxService1 {

    @Autowired
    private UserMapper userMapper;


    @Override
    @Transactional(rollbackFor = Exception.class)
    public int updateUsernameById(Long id) {
        return userMapper.updateUsernameById(id);
    }
}
