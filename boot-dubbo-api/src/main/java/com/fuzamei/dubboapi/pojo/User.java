package com.fuzamei.dubboapi.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author ylx
 * Created by fuzamei on 2018/8/25.
 */
@Data
public class User implements Serializable{

    private Integer id;
    private String username;
    private String password;
    private Integer age;
    private Integer gender;

}
