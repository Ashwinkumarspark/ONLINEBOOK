package com.example.SPARK.ONLINEBOOK.controller;

import com.example.SPARK.ONLINEBOOK.model.OrderModel;
import com.example.SPARK.ONLINEBOOK.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RequestMapping("/orders")
@RestController
public class OrderController {

    @Autowired
    private OrderService or;

    @GetMapping("/users/{userId}")
    public Optional<OrderModel> getSingleOrderByUserId(@PathVariable("userId") String userId) {
        return or.getSingleOrderByUserId(userId);
    }


    @PostMapping("/update")
    public OrderModel createOrder(@RequestBody OrderModel orderModel) {

        return or.createOrderService(orderModel);
    }

}