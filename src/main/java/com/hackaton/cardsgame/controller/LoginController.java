package com.hackaton.cardsgame.controller;

import com.hackaton.cardsgame.model.User;
import com.hackaton.cardsgame.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class LoginController {

    private final UserRepository userRepository;

    @PostMapping(value = "/login")
    public User login(@RequestBody User user) {
        return userRepository.save(user);
    }

}
