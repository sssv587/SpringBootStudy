package com.futurebytedance.boot.bean;

import lombok.Data;

import java.util.Date;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/10/4 - 17:53
 * @Description
 */
@Data
public class Person {
    private String userName;
    private Integer age;
    private Date birth;
    protected Pet pet;
}
