package com.futurebytedance.boot05webadmin.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/10/9 - 23:39
 * @Description
 */
@ResponseStatus(value = HttpStatus.FORBIDDEN, reason = "用户数量过多")
public class UserTooManyException extends RuntimeException {
    public UserTooManyException() {
    }

    public UserTooManyException(String message) {
        super(message);
    }
}
