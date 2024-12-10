package com.example.SPARK.ONLINEBOOK.service;

import com.example.SPARK.ONLINEBOOK.dal.CartModelRepo;
import com.example.SPARK.ONLINEBOOK.model.CartModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CartService {
    @Autowired
    private CartModelRepo cmr;

    public Optional<CartModel> getUserService(String userId){
        return cmr.findByUserId(userId);
    }

    public CartModel createCartService(CartModel cm){
        return cmr.save(cm);
    }
}
