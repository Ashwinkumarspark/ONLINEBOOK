package com.example.SPARK.ONLINEBOOK.controller;

import com.example.SPARK.ONLINEBOOK.model.UserModel;
import com.example.SPARK.ONLINEBOOK.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequestMapping("/users")
@RestController
public class UserController {


    @Autowired
    private UserService us;
    @PostMapping("/post")
    public UserModel createUserControl(@RequestBody UserModel um){
        return us.createUser(um);
    }

    @GetMapping("/get/{name}")
    public Optional<UserModel> getUserControl(@PathVariable("name") String name){
        return us.getUserService(name);
    }

}
