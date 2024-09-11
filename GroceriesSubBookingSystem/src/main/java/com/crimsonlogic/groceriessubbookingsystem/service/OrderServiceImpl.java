package com.crimsonlogic.groceriessubbookingsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.crimsonlogic.groceriessubbookingsystem.entity.Order;
import com.crimsonlogic.groceriessubbookingsystem.repository.OrderRepository;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void saveOrder(Order order) {
        orderRepository.save(order);
    }

    @Override
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    @Override
    public Order getOrderById(String orderId) {
        return orderRepository.findById(orderId).orElse(null);
    }

    @Override
    public void updateOrderStatus(String orderId, Order.OrderStatus status) {
        Order order = getOrderById(orderId);
        if (order != null) {
            order.setOrderStatus(status);
            orderRepository.save(order);
        }
    }
}
