package com.example.mongo.configuration.repository;

import com.example.mongo.configuration.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ProductRepository extends MongoRepository<Product, String> {
    // Custom query method to find products by category
    List<Product> findByCategory(String category);
}
