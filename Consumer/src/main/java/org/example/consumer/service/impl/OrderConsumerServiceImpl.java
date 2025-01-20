package org.example.consumer.service.impl;

import org.example.consumer.service.OrderConsumerService;
import org.example.ordercommon.entity.Order;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderConsumerServiceImpl implements OrderConsumerService {

    private final List<Order> orderList = new ArrayList<>();

    @Override
    @KafkaListener(topics = "orders", groupId = "order-processing")
    public void consumeOrder(Order order) {
        orderList.add(order);
        System.out.println("Received and added order: " + order);
    }

    @Override
    public List<Order> getOrders() {
        return new ArrayList<>(orderList);
    }
}
