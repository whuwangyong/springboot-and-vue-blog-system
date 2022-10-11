package com.runhuo.blog.service;

import com.runhuo.blog.dao.entity.SysUser;
import com.runhuo.blog.vo.params.LoginParams;
import com.runhuo.blog.vo.result.Result;

/**
 * created by IntelliJ IDEA 2022.2.2
 *
 * @author run huo
 * @date 2022/9/23 13:02
 */
public interface LoginService {
    Result login(LoginParams loginParams);

    Result logout(String token);

    Result register(LoginParams loginParams);
    SysUser checkToken(String token);
}
