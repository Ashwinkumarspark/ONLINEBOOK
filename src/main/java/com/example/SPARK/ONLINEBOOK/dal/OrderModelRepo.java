package com.example.SPARK.ONLINEBOOK.dal;

import com.example.SPARK.ONLINEBOOK.model.OrderModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface OrderModelRepo extends MongoRepository<OrderModel, String>{



   public Optional<OrderModel> findByUserId(String userId);
}
