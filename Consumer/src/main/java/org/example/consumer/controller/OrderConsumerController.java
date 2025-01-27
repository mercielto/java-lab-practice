package org.example.consumer.controller;

import lombok.RequiredArgsConstructor;
import org.example.consumer.service.OrderConsumerService;
import org.example.consumer.service.impl.OrderServiceClient;
import org.example.ordercommon.entity.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/consumer")
@RequiredArgsConstructor
public class OrderConsumerController {

    private final OrderConsumerService orderConsumerService;
    private final OrderServiceClient orderServiceClient;

    @GetMapping("/received-orders")
    public List<Order> getOrders() {
        return orderConsumerService.getOrders();
    }

    @GetMapping("/customer-name/{id}")
    public String getCustomerName(@PathVariable String id) {
        return orderServiceClient.getCustomerName(id);
    }
}

