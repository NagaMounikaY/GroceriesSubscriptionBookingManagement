package com.crimsonlogic.groceriessubbookingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crimsonlogic.groceriessubbookingsystem.entity.OrderDetails;

public interface OrderDetailsRepository extends JpaRepository<OrderDetails,String>{

}
