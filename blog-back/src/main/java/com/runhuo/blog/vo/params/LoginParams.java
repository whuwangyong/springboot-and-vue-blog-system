package com.runhuo.blog.vo.params;

import lombok.Data;

/**
 * created by IntelliJ IDEA 2022.2.2
 *
 * @author run huo
 * @date 2022/9/23 13:03
 */
@Data
public class LoginParams {
    private String account;
    private String password;
    private String nickname;
}
