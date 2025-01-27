package org.example.producer.controller;

import lombok.RequiredArgsConstructor;
import org.example.ordercommon.entity.Order;
import org.example.producer.service.OrderProducerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producer")
@RequiredArgsConstructor
public class OrderProducerController {

    private final OrderProducerService orderProducerService;

    @PostMapping("/send-order")
    public String sendOrder(@RequestBody Order order) {
        orderProducerService.sendOrder(order);
        return "Order sent: " + order;
    }
}
