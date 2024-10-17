package com.example.Spring_HomeWork.services;

import com.example.Spring_HomeWork.model.Task;
import com.example.Spring_HomeWork.repository.TaskRepository;
import lombok.Data;
import org.hibernate.type.internal.UserTypeSqlTypeAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service
public class TaskService{

    @Autowired
    private TaskRepository taskRepository;

    public Task addTask(Task task) {
        return taskRepository.save(task);
    }

    public List<Task> getAllTask() {
        return taskRepository.findAll();
    }

    public List<Task> getTaskByStatus(Task.Status status) {
        return taskRepository.findByStatus(status);
    }

    public Task updateTaskStatus(Long id, Task.Status status) {
        Task task = taskRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Task not found"));
        task.setStatus(status);
        return taskRepository.save(task);
    }

    public void deleteTask(Long id){
        taskRepository.deleteById(id);
    }
}
