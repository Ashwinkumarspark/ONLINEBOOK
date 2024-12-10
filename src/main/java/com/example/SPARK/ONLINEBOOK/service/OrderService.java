package com.example.SPARK.ONLINEBOOK.service;

import com.example.SPARK.ONLINEBOOK.dal.OrderModelRepo;
import com.example.SPARK.ONLINEBOOK.model.OrderModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderModelRepo repo;

    public Optional<OrderModel> getSingleOrderByUserId(String userId) {
        return repo.findByUserId(userId);
    }
    public OrderModel createOrderService (OrderModel orm){
        return repo.save(orm);
    }

}
