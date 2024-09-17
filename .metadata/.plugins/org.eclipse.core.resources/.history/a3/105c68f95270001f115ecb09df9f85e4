package com.crimsonlogic.groceriessubbookingsystem.service;

import com.crimsonlogic.groceriessubbookingsystem.entity.OrderDetails;
import com.crimsonlogic.groceriessubbookingsystem.repository.OrderDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderDetailsServiceImpl implements OrderDetailsService {

    @Autowired
    private OrderDetailsRepository orderDetailsRepository;

    @Override
    public OrderDetails saveOrderDetails(OrderDetails orderDetails) {
        return orderDetailsRepository.save(orderDetails);
    }

    @Override
    public List<OrderDetails> getAllOrderDetails() {
        return orderDetailsRepository.findAll();
    }

    @Override
    public Optional<OrderDetails> getOrderDetailsById(String id) {
        return orderDetailsRepository.findById(id);
    }

    @Override
    public void deleteOrderDetails(String id) {
        orderDetailsRepository.deleteById(id);
    }
}
