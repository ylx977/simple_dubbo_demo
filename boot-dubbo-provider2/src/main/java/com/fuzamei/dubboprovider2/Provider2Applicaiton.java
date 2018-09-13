package com.fuzamei.dubboprovider2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ImportResource;

import java.io.IOException;

/**
 * Created by fuzamei on 2018/9/13.
 */
@SpringBootApplication
@ImportResource(locations = {"classpath:config/spring-dubbo.xml"})
@MapperScan(basePackages = {"com.fuzamei.dubboprovider2.mapper"})
public class Provider2Applicaiton {

    public static void main(String[] args) {
        new SpringApplicationBuilder(Provider2Applicaiton.class)
                .web(WebApplicationType.NONE)
                .run(args);
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
