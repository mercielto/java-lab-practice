package org.example.consumer.service;

import org.example.ordercommon.entity.Order;

import java.util.List;


public interface OrderConsumerService {
    void consumeOrder(Order order);
    List<Order> getOrders();
}

