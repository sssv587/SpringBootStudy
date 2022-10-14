package com.futurebytedance.boot05webadmin.bean;

import lombok.Data;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/10/13 - 23:24
 * @Description
 */
@Data
public class Account {
    private Long id;
    private String userId;
    private Integer money;
}
