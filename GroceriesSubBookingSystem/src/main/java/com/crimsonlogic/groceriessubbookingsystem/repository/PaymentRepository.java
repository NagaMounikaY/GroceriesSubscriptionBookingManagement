package com.crimsonlogic.groceriessubbookingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crimsonlogic.groceriessubbookingsystem.entity.Payments;

public interface PaymentRepository extends JpaRepository<Payments,String>{

}
