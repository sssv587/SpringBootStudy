package com.futurebytedance.boot05webadmin.bean;

import lombok.Data;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/10/14 - 23:46
 * @Description
 */
@Data
public class City {
    private Long id;
    private String name;
    private String state;
    private String country;
}
