package com.example.Spring4_3.models;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Product {

    private String name;
    private double price;
}
