package com.example.mongo.configuration.service;

import com.example.mongo.configuration.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    // Get all products
    List<Product> getAllProducts();

    // Get product by ID
    Optional<Product> getProductById(String id);

    // Add a new product
    Product addProduct(Product product);

    // Delete product by ID
    void deleteProduct(String id);
}
