package org.example.ordercommon.entity;

import lombok.*;

import java.io.Serializable;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Order implements Serializable {
    private String orderId;
    private String customerName;
    private double totalAmount;
}
