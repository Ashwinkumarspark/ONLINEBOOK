package com.example.SPARK.ONLINEBOOK.controller;

import com.example.SPARK.ONLINEBOOK.model.CartModel;
import com.example.SPARK.ONLINEBOOK.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
@RequestMapping("/carts")
@RestController
public class CartController {
    @Autowired
    private CartService cs;

    @GetMapping("/getcart/{userId}")
    public Optional<CartModel> getUserControl(@PathVariable("userId") String userId) {
        return cs.getUserService(userId);
    }

    @PostMapping("/post")
    public CartModel createcontrol(@RequestBody CartModel cm) {
        return cs.createCartService(cm);
    }
}
