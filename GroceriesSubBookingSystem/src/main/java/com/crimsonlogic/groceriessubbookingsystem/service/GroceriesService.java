package com.crimsonlogic.groceriessubbookingsystem.service;

import java.util.List;
import java.util.Optional;

import com.crimsonlogic.groceriessubbookingsystem.entity.Groceries;

public interface GroceriesService {
    List<Groceries> getAllGroceries();
    Optional<Groceries> getGroceryById(String id);
    Groceries saveGrocery(Groceries grocery);
    void deleteGroceryById(String id);
    List<Groceries> findByName(String name);
}
