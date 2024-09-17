package com.crimsonlogic.groceriessubbookingsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crimsonlogic.groceriessubbookingsystem.entity.Groceries;

public interface GroceryRepository extends JpaRepository<Groceries, String> {
	List<Groceries> findByGroceryNameContainingIgnoreCase(String name);

}
