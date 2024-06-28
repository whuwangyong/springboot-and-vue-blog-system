package com.runhuo.blog.utils;

import io.jsonwebtoken.Jwt;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * created by IntelliJ IDEA 2022.2.2
 *
 * @author run huo
 * @date 2022/9/23 12:53
 */
public class JWTUtils {
    // 生成密钥
    static Key key = Keys.secretKeyFor(SignatureAlgorithm.HS256);

    public static String createToken(Long userId) {
        Map<String, Object> claims = new HashMap<>();
        claims.put("userId", userId);
        JwtBuilder jwtBuilder = Jwts.builder()
                // 签发算法，秘钥为jwtToken
                .signWith(key)
                // body数据，要唯一，自行设置
                .claims(claims)
                // 设置签发时间
                .issuedAt(new Date())
                // 一天的有效时间
                .expiration(new Date(System.currentTimeMillis() + 24L * 60 * 60 * 1000));
        String token = jwtBuilder.compact();
        return token;
    }

    public static Map<String, Object> checkToken(String token) {
        try {
            Jwt parse = Jwts.parser().setSigningKey(key).build().parseClaimsJws(token);
            return (Map<String, Object>) parse.getBody();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }
}
