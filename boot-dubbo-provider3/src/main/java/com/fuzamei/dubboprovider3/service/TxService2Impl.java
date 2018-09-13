package com.fuzamei.dubboprovider3.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.fuzamei.dubboapi.consumer.TxService2;
import com.fuzamei.dubboprovider3.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by fuzamei on 2018/9/13.
 */
@Service(version = "1.0.0")
public class TxService2Impl implements TxService2 {

    @Autowired
    private UserMapper userMapper;


    @Override
    @Transactional(rollbackFor = Exception.class)
    public int updateUsernameById(Long id) {
        if(1==1){
            throw new RuntimeException();
        }
        return userMapper.updateUsernameById(id);
    }
}
