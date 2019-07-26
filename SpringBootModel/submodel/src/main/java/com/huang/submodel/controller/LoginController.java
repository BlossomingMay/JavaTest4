package com.huang.submodel.controller;

import com.huang.submodel.domain.User;
import com.huang.submodel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class LoginController {
    @Autowired
    UserService userService;

    @PostMapping("/")
    public String login(@RequestBody User user){

        return userService.getUserInfo(user);

    }
}