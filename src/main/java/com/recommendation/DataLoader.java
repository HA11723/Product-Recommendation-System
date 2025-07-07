package com.recommendation;

import com.recommendation.model.Product;
import com.recommendation.model.User;
import com.recommendation.repository.ProductRepository;
import com.recommendation.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final ProductRepository productRepository;
    private final UserRepository userRepository;



    public DataLoader(ProductRepository productRepository, UserRepository userRepository) {
        this.productRepository = productRepository;
        this.userRepository = userRepository;
    }


    @Override
    public void run(String... args) {
        productRepository.save(new Product(1L, "iPhone 14", "Latest Apple phone", 999.99));
        productRepository.save(new Product(2L, "Samsung Galaxy S23", "Flagship Android phone", 899.99));
        userRepository.save(new User(1L, "Hadi Nasir", "Hadi@gmail.com"));
        userRepository.save(new User(2L, "Aleen Mansour", "Aleen@gmail.com"));
    }

}
