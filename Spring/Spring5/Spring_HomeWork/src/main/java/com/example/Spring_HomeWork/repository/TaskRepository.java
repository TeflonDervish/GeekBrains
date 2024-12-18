package com.example.Spring_HomeWork.repository;

import com.example.Spring_HomeWork.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByStatus(Task.Status status);
}
