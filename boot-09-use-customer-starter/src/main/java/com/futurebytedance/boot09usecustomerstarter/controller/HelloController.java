package com.futurebytedance.boot09usecustomerstarter.controller;

import com.futurebytedance.boot09customerautoconfig.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/10/18 - 23:25
 * @Description
 */
@RestController
public class HelloController {
    @Autowired
    HelloService helloService;

    @GetMapping("/hello")
    public String sayHello() {
        String sayHello = helloService.sayHello("张三");
        return sayHello;
    }
}
