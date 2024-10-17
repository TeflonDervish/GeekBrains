package com.example.Spring_HomeWork.model;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "task")
public class Task {

    public enum Status {
        COMPLETED,
        IN_PROGRESS,
        NOT_STARTED
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private String description;

    @Enumerated(EnumType.STRING)
    @Column
    private Status status;

    @Column
    private LocalDateTime createDate;

    @PrePersist
    private void onCreate() {
        this.createDate = LocalDateTime.now();
    }

}
