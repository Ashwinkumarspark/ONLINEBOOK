package com.example.SPARK.ONLINEBOOK.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "carts")
public class CartModel {
    @Id
    private String id;
    private String userId;
    private String cartItems;
    private Integer totalAmount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCartItems() {
        return cartItems;
    }

    public void setCartItems(String cartItems) {
        this.cartItems = cartItems;
    }

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    public CartModel(String id, String userId, String cartItems, Integer totalAmount) {
        this.id = id;
        this.userId = userId;
        this.cartItems = cartItems;
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        return "cartmodel{" +
                "id='" + id + '\'' +
                ", userId=" + userId +
                ", cartItems='" + cartItems + '\'' +
                ", totalAmount=" + totalAmount +
                '}';
    }
}
