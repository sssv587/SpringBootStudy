package com.futurebytedance.boot05webadmin.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.futurebytedance.boot05webadmin.bean.User;
import com.futurebytedance.boot05webadmin.mapper.UserMapper;
import com.futurebytedance.boot05webadmin.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/10/15 - 20:29
 * @Description
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
