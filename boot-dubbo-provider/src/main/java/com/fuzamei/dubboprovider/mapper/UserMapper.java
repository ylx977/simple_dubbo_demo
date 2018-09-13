package com.fuzamei.dubboprovider.mapper;

import com.fuzamei.dubboapi.pojo.UserDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;

/**
 * @author ylx
 * Created by fuzamei on 2018/8/26.
 */
@Mapper
public interface UserMapper {

    UserDO findUserById(@Param("id") Long id);

    int updateUsernameById(@Param("id") Long id);
}
