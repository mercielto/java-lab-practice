package org.example.consumer.service.impl;

import net.devh.boot.grpc.client.inject.GrpcClient;
import org.example.consumer.proto.OrderRequest;
import org.example.consumer.proto.OrderServiceGrpc;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceClient {

    @GrpcClient("order-service")
    private OrderServiceGrpc.OrderServiceBlockingStub service;

    public String getCustomerName(String id) {
        return service.getOrder(OrderRequest.newBuilder()
                .setOrderId(id)
                .build()).getCustomerName();
    }
}
