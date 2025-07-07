package com.recommendation.repository;

import com.recommendation.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

// This interface extends JpaRepository to provide CRUD operations for the Product entity
public interface ProductRepository extends JpaRepository<Product, Long> {
    // Spring Data JPA will automatically implement CRUD methods for us, such as:
    // - save(Product product)
    // - findById(Long id)
    // - findAll()
    // - deleteById(Long id)
}
