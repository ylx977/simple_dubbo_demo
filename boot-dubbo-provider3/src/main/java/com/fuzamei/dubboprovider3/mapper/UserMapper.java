package com.fuzamei.dubboprovider3.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by fuzamei on 2018/9/13.
 */
@Mapper
public interface UserMapper {

    int updateUsernameById(@Param("id") Long id);
}
