package com.futurebytedance.boot05webadmin.service;

import com.futurebytedance.boot05webadmin.bean.Account;
import com.futurebytedance.boot05webadmin.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/10/13 - 23:37
 * @Description
 */
@Service
public class AccountService {
    @Autowired
    AccountMapper accountMapper;

    public Account getAcctById(Long id) {
        return accountMapper.getAcct(id);
    }
}
