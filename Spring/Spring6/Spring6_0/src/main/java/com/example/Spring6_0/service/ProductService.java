package com.example.Spring6_0.service;


import com.example.Spring6_0.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    List<Product> getAllProducts();
    Product getProductById(Long id);
    Product updateProduct(Product product);
    Product createProduct(Product product);
    void deleteProduct(Long id);
}
