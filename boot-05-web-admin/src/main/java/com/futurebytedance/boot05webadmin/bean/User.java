package com.futurebytedance.boot05webadmin.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/10/7 - 21:07
 * @Description
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    private String userName;
    private String password;
}
