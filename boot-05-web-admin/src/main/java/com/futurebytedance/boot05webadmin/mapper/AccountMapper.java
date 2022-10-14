package com.futurebytedance.boot05webadmin.mapper;

import com.futurebytedance.boot05webadmin.bean.Account;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/10/13 - 23:24
 * @Description
 */
@Mapper
public interface AccountMapper {
    Account getAcct(Long id);
}
