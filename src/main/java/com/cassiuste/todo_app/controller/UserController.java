package com.cassiuste.todo_app.controller;

import com.cassiuste.todo_app.model.User;
import com.cassiuste.todo_app.service.UserService;
import com.cassiuste.todo_app.token.Token;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PutMapping("/register")
    public User registerUser(@RequestBody User user){
        return userService.registerUser(user);
    }

//    @PutMapping("/login")
//    public Token loginUser(@RequestBody User user){
//        return userService.loginUser(user);
//    }

}
