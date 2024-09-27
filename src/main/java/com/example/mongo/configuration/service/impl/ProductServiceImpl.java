package com.example.mongo.configuration.service.impl;

import com.example.mongo.configuration.model.Product;
import com.example.mongo.configuration.repository.ProductRepository;
import com.example.mongo.configuration.service.ProductService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    // Get all products
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    // Get product by ID
    public Optional<Product> getProductById(String id) {
        return productRepository.findById(id);
    }

    @Override
    // Add a new product
    public Product addProduct(Product product) {
        Date date = new Date();
        product.setDate(date);
        return productRepository.save(product);
    }

    @Override
    // Delete product by ID
    public void deleteProduct(String id) {
        productRepository.deleteById(id);
    }
}
