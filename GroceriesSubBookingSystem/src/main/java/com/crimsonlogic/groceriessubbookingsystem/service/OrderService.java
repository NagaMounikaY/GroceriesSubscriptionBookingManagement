package com.crimsonlogic.groceriessubbookingsystem.service;

import com.crimsonlogic.groceriessubbookingsystem.entity.Order;
import java.util.List;

public interface OrderService {
    void saveOrder(Order order);
    List<Order> getAllOrders();
    Order getOrderById(String orderId);
    void updateOrderStatus(String orderId, Order.OrderStatus status);
}
