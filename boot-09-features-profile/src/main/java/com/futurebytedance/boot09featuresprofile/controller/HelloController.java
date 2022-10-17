package com.futurebytedance.boot09featuresprofile.controller;

import com.futurebytedance.boot09featuresprofile.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/10/17 - 23:17
 * @Description
 */
@RestController
public class HelloController {
    @Value("${person.name:李四}")
    private String name;

    @Autowired
    private Person person;

    @GetMapping("/")
    public String hello() {
        return person.getClass().toString();
    }

    @GetMapping("/person")
    public Person person(){
        return person;
    }
}
