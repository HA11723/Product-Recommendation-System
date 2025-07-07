package com.recommendation.controller;

import com.recommendation.model.Product;
import com.recommendation.service.RecommendationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;


import java.util.List;

@RestController
public class RecommendationController {

    private final RecommendationService recommendationService;

    public RecommendationController(RecommendationService recommendationService) {
        this.recommendationService = recommendationService;
    }

    @GetMapping("/api/recommendations/{userId}")
    public List<Product> getRecommendations(@PathVariable Long userId) {
        return recommendationService.getRecommendations(userId);
    }
    @PostMapping("/api/products")
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
        Product savedProduct = recommendationService.saveProduct(product);
        return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
    }

}
