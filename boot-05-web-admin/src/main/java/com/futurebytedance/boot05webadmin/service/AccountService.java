package com.futurebytedance.boot05webadmin.service;

import com.futurebytedance.boot05webadmin.bean.Account;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/10/15 - 20:30
 * @Description
 */
public interface AccountService {
    Account getAcctById(Long id);
}
