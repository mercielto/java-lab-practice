// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: order.proto

package org.example.grpc_server.proto;

public interface OrderResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:OrderResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string orderId = 1;</code>
   * @return The orderId.
   */
  java.lang.String getOrderId();
  /**
   * <code>string orderId = 1;</code>
   * @return The bytes for orderId.
   */
  com.google.protobuf.ByteString
      getOrderIdBytes();

  /**
   * <code>string customerName = 2;</code>
   * @return The customerName.
   */
  java.lang.String getCustomerName();
  /**
   * <code>string customerName = 2;</code>
   * @return The bytes for customerName.
   */
  com.google.protobuf.ByteString
      getCustomerNameBytes();

  /**
   * <code>double totalAmount = 3;</code>
   * @return The totalAmount.
   */
  double getTotalAmount();
}
