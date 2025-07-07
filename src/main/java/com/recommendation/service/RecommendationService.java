package com.recommendation.service;

import com.recommendation.model.Product;
import com.recommendation.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecommendationService {

    private final ProductRepository productRepository;

    public RecommendationService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getRecommendations(Long userId) {
        // For now, just return all products
        return productRepository.findAll();
    }
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }
}
