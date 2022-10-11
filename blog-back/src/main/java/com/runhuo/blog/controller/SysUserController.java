package com.runhuo.blog.controller;

import com.runhuo.blog.service.LoginService;
import com.runhuo.blog.service.SysUserService;
import com.runhuo.blog.vo.params.LoginParams;
import com.runhuo.blog.vo.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * created by IntelliJ IDEA 2022.2.2
 *
 * @author run huo
 * @date 2022/9/23 12:58
 */
@RestController
@RequestMapping("/users")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    @Autowired
    private LoginService loginService;

    /**
     * 登录接口
     * @param loginParams
     * @return
     */
    @PostMapping("/login")
    public Result login(@RequestBody LoginParams loginParams) {
        return loginService.login(loginParams);
    }

    @GetMapping("/currentUser")
    public Result currentUser(@RequestHeader("Authorization") String token){
        return sysUserService.findUserByToken(token);
    }

    @GetMapping("/logout")
    public Result logout(@RequestHeader("Authorization") String token){
        return loginService.logout(token);
    }

    /**
     * 注册接口
     * @param loginParams
     * @return
     */
    @PostMapping("/register")
    public Result register(@RequestBody LoginParams loginParams){
        return loginService.register(loginParams);
    }
}
