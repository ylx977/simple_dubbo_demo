package com.fuzamei.dubboconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @author ylx
 * Created by fuzamei on 2018/8/25.
 */
@SpringBootApplication(scanBasePackages = "com.fuzamei.dubboconsumer.controller")
@ImportResource(locations = {"classpath:config/spring-dubbo.xml"})
public class DubboCustomerDemo {

    public static void main(String[] args) {
        SpringApplication.run(DubboCustomerDemo.class, args);
    }

}
