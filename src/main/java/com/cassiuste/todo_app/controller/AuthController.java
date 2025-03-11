package com.cassiuste.todo_app.controller;

import com.cassiuste.todo_app.service.AuthService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }
}
