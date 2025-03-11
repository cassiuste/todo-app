package com.cassiuste.todo_app.service;

import com.cassiuste.todo_app.model.User;
import io.jsonwebtoken.Jwts;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.Date;
import java.util.Map;

@Service
public class JwtService {

    @Value("${jwt.secret-key}")
    private String secretKey;

    @Value("${jwt.expiration}")
    private long expiration;

    @Value("${refresh-token.expiration}")
    private long refreshTokenExpiration;

    private String buildToken(User user, long expiration){
        return Jwts.builder()
                .id(user.getId().toString())
                .claim(Map.of("name", user.getName()))
                .subject(user.getEmail())
                .issuedAt(new Date(System.currentTimeMillis()))
                .expiration(new Date(System.currentTimeMillis()) + expiration))
    }


}
