package com.example.SPARK.ONLINEBOOK.service;

import com.example.SPARK.ONLINEBOOK.dal.UserModelRepo;
import com.example.SPARK.ONLINEBOOK.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserModelRepo umr;

    public UserModel createUser(UserModel um){
        return umr.save(um);
    }

    public Optional<UserModel> getUserService(String name){
        return umr.findByName(name);
    }
}
