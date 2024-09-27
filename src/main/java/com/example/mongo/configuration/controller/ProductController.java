package com.example.mongo.configuration.controller;

import com.example.mongo.configuration.model.Product;
import com.example.mongo.configuration.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductServiceImpl productServiceimpl;

    // Get all products
    @GetMapping
    public List<Product> getAllProducts() {
        return productServiceimpl.getAllProducts();
    }

    // Get product by ID
    @GetMapping("/{id}")
    public Optional<Product> getProductById(@PathVariable String id) {
        return productServiceimpl.getProductById(id);
    }

    // Add a new product
    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        return productServiceimpl.addProduct(product);
    }

    // Delete product by ID
    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable String id) {
        productServiceimpl.deleteProduct(id);
    }
}
