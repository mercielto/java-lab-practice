package org.example.producer.service;

import org.example.ordercommon.entity.Order;

public interface OrderProducerService {
    void sendOrder(Order order);
}
