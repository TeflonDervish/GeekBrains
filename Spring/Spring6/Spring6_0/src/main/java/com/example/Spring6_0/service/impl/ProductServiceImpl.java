package com.example.Spring6_0.service.impl;

import com.example.Spring6_0.model.Product;
import com.example.Spring6_0.repository.ProductRepository;
import com.example.Spring6_0.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id).orElseThrow(null);
    }

    @Override
    public Product updateProduct(Product product) {
        Product productById = getProductById(product.getId());

        productById.setCount(product.getCount());
        productById.setName(product.getName());
        productById.setQuantity(product.getQuantity());
        return productRepository.save(productById);
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(Long id) {
        Product productById = getProductById(id);
        productRepository.delete(productById);
    }
}
