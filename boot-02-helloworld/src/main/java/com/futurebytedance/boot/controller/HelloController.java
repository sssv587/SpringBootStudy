package com.futurebytedance.boot.controller;

import com.futurebytedance.boot.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/9/25 - 21:27
 * @Description
 */
@RestController
public class HelloController {
    @Autowired
    Person person;

    @RequestMapping("person")
    public Person person() {
        String userName = person.getUserName();
        System.out.println(userName);
        return person;
    }
}
