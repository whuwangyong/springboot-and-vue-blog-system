package com.runhuo.blog.service;

import com.runhuo.blog.dao.entity.SysUser;
import com.runhuo.blog.vo.UserVo;
import com.runhuo.blog.vo.result.Result;

/**
 * created by IntelliJ IDEA 2022.2.2
 *
 * @author run huo
 * @date 2022/9/23 9:10
 */
public interface SysUserService {

    SysUser findUserById(Long id);

    SysUser findUser(String account, String password);

    Result findUserByToken(String token);

    SysUser findUserByAccount(String account);

    void save(SysUser sysUser);

    UserVo findUserVoById(Long authorId);
}
