package com.crimsonlogic.groceriessubbookingsystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crimsonlogic.groceriessubbookingsystem.entity.Groceries;
import com.crimsonlogic.groceriessubbookingsystem.repository.GroceryRepository;

@Service
public class GroceriesServiceImpl implements GroceriesService {

    @Autowired
    private GroceryRepository groceriesRepository;

    @Override
    public List<Groceries> getAllGroceries() {
        return groceriesRepository.findAll();
    }

    @Override
    public Optional<Groceries> getGroceryById(String id) {
        return groceriesRepository.findById(id);
    }

    @Override
    public Groceries saveGrocery(Groceries grocery) {
        return groceriesRepository.save(grocery);
    }

    @Override
    public void deleteGroceryById(String id) {
        groceriesRepository.deleteById(id);
    }

    @Override
    public List<Groceries> findByName(String name) {
        return groceriesRepository.findByGroceryNameContainingIgnoreCase(name);
    }
}
