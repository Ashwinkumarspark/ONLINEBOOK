package com.example.SPARK.ONLINEBOOK.dal;

import com.example.SPARK.ONLINEBOOK.model.UserModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserModelRepo extends MongoRepository<UserModel, String>{
    public Optional <UserModel> findByName (String name);


}