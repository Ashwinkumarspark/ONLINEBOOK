package com.example.SPARK.ONLINEBOOK.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
@Document(collection = "orders")
public class OrderModel {
    @Id
    private String id;
    private String userId;
    private String orderDate;
    private String status;
    private  Long totalAmount;
    private String orderItems ;

    public OrderModel(String id, String userId, String orderDate, String status, Long totalAmount, String orderItems) {
        this.id = id;
        this.userId = userId;
        this.orderDate = orderDate;
        this.status = status;
        this.totalAmount = totalAmount;
        this.orderItems = orderItems;
    }

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

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(String orderItems) {
        this.orderItems = orderItems;
    }

    @Override
    public String toString() {
        return "ordermodel{" +
                "id='" + id + '\'' +
                ", userId=" + userId +
                ", orderDate=" + orderDate +
                ", status='" + status + '\'' +
                ", totalAmount=" + totalAmount +
                ", orderItems='" + orderItems + '\'' +
                '}';
    }
}
