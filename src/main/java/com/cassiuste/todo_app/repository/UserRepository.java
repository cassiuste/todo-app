package com.cassiuste.todo_app.repository;

import com.cassiuste.todo_app.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByNameAndEmailAndPassword(String name, String email, String password);
}
