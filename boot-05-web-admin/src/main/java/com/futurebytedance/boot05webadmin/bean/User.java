package com.futurebytedance.boot05webadmin.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/10/7 - 21:07
 * @Description
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@TableName("user")
public class User {
    /**
     * 所有属性都应该在数据库中
     */
    @TableField(exist = false)
    private String userName;
    @TableField(exist = false)
    private String password;

    //一下是数据库字段
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
