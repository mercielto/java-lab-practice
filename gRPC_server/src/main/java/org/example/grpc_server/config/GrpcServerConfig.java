package org.example.grpc_server.config;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.example.grpc_server.service.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Configuration
public class GrpcServerConfig {

    private final OrderServiceImpl orderService;

    @Value("${grpc.server.port}")
    private int port;

    private Server server;

    public GrpcServerConfig(OrderServiceImpl orderService) {
        this.orderService = orderService;
    }

    @PostConstruct
    public void startServer() throws Exception {
        server = ServerBuilder.forPort(port)
                .addService(orderService)
                .build();
        server.start();
        System.out.println("gRPC Server started on port " + port + "...");
    }

    @PreDestroy
    public void stopServer() {
        if (server != null) {
            System.out.println("Stopping gRPC Server...");
            server.shutdown();
        }
    }
}
