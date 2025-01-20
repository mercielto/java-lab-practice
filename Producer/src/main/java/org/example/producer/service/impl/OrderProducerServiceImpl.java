package org.example.producer.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.ordercommon.entity.Order;
import org.example.producer.service.OrderProducerService;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderProducerServiceImpl implements OrderProducerService {

    private final KafkaTemplate<String, Order> kafkaTemplate;

    @Override
    public void sendOrder(Order order) {
        kafkaTemplate.send("orders", order.getOrderId(), order);
    }
}
