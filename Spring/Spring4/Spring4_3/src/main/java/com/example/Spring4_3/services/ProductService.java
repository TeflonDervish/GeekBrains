package com.example.Spring4_3.services;

import com.example.Spring4_3.models.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public  List<Product> getAllProducts() {
        return products;
    }
}
