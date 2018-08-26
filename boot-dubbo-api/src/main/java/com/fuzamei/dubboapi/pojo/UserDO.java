package com.fuzamei.dubboapi.pojo;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * @author ylx
 * Created by fuzamei on 2018/8/17.
 */
@Data
@Builder
public class UserDO implements Serializable{

    private Long id;
    private String username;
    private String password;
    private String address;
    private Long ctime;
    private Long utime;
    private Long price;

}
