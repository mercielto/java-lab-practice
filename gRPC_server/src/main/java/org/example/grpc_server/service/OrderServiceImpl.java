package org.example.grpc_server.service;

import io.grpc.stub.StreamObserver;
import org.example.grpc_server.proto.OrderRequest;
import org.example.grpc_server.proto.OrderResponse;
import org.example.grpc_server.proto.OrderServiceGrpc;
import org.example.ordercommon.entity.Order;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class OrderServiceImpl extends OrderServiceGrpc.OrderServiceImplBase {

    private final Map<String, Order> data = Map.of(
            "1", new Order("1", "John Snow", 100),
            "2", new Order("2", "Ned Stark", 1000)
    );

    @Override
    public void getOrder(OrderRequest request, StreamObserver<OrderResponse> responseObserver) {
        String orderId = request.getOrderId();

        Order order = data.get(orderId);
        OrderResponse response = OrderResponse.newBuilder()
                .setOrderId(order.getOrderId())
                .setCustomerName(order.getCustomerName())
                .setTotalAmount(order.getTotalAmount())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}