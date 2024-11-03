package com.example.Spring6_1.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Locked;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Reader {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    private Book book;

    public Reader(String name) {
        this.name = name;
    }
}
