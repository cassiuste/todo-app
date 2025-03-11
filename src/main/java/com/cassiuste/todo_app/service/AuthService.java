package com.cassiuste.todo_app.service;

import com.cassiuste.todo_app.repository.TokenRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private final TokenRepository tokenRepository;

    public AuthService(TokenRepository tokenRepository) {
        this.tokenRepository = tokenRepository;
    }
}
