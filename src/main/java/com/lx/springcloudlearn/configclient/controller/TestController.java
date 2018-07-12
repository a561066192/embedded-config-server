package com.lx.springcloudlearn.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试从config-server那里读取配置
 **/
@RestController
//此注解表示当前类会在访问了refresh接口后更新配置文件的属性到类中。必备
@RefreshScope
public class TestController {
//
    @Value("${name}")
    private String name;

    @Value("${age}")
    private String age;


    @Value("${password}")
    private String password;

    @RequestMapping("/test")
    public String test(){
        return "从config-server读取到的name："+name+",age:"+age;
    }

    @RequestMapping("/test1")
    public String test1(){
        return "从config-server读取到的name:"+name+",password:"+password;
    }

    @RequestMapping("/test0")
    public String test0(){
        return "test0";
    }
}
