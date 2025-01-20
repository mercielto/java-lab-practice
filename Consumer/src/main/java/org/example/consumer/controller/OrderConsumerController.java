package org.example.consumer.controller;

import lombok.RequiredArgsConstructor;
import org.example.consumer.service.OrderConsumerService;
import org.example.ordercommon.entity.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/consumer")
@RequiredArgsConstructor
public class OrderConsumerController {

    private final OrderConsumerService orderConsumerService;

    @GetMapping("/received-orders")
    public List<Order> getOrders() {
        return orderConsumerService.getOrders();
    }
}

