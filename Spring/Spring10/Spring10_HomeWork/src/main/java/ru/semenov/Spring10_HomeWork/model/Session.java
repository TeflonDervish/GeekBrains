package ru.semenov.Spring10_HomeWork.model;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Session {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


}
