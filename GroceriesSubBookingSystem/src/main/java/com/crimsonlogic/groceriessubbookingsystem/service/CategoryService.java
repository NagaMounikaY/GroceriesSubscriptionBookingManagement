package com.crimsonlogic.groceriessubbookingsystem.service;

import com.crimsonlogic.groceriessubbookingsystem.entity.Category;
import java.util.List;
import java.util.Optional;

public interface CategoryService {

    // Save Category
    Category saveCategory(Category category);

    // Get all Categories
    List<Category> getAllCategories();

    // Get Category by ID
    Optional<Category> getCategoryById(String id);

    // Delete Category by ID
    void deleteCategory(String id);
}
