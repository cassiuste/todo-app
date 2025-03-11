package com.cassiuste.todo_app.service;

import com.cassiuste.todo_app.model.User;
import com.cassiuste.todo_app.repository.UserRepository;
import com.cassiuste.todo_app.token.Token;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User registerUser(User user) {
        return userRepository.save(user);
    }

//    // Va a ser un token
//    public Optional<Token> login(User user){
//        Optional<User> user1 = userRepository.findByNameAndEmailAndPassword
//                (user.getName(), user.getEmail(), user.getPassword());
//        if(user1.isPresent()){
//            return
//        }
//    }

}
