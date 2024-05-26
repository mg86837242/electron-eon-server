package dev.by.order.dao;

import dev.by.order.Order;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface OrderDao {

    List<Order> selectAllOrders();

    Optional<Order> selectOrderById(UUID orderId);

    boolean existsOrderById(UUID orderId);

    void insertOrder(Order order);

    void updateOrder(Order update);

    void deleteOrderById(UUID orderId);
}