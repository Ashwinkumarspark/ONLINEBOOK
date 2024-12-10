package com.example.SPARK.ONLINEBOOK.dal;

import com.example.SPARK.ONLINEBOOK.model.CartModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CartModelRepo extends MongoRepository<CartModel, String> {

    Optional<CartModel> findByUserId (String userId);
}
