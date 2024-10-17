package com.example.Spring_HomeWork.controllers;

import com.example.Spring_HomeWork.model.Task;
import com.example.Spring_HomeWork.services.TaskService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Data
@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    //1. Добавление задачи
    @PostMapping
    public Task createTask(@RequestBody Task task) {
        return taskService.addTask(task);
    }

    //2. Просмотр всех задач
    @GetMapping
    public List<Task> getAllTasks() {
        return taskService.getAllTask();
    }

    //3. Просмотр задач по статусу
    @GetMapping("/status/{status}")
    public List<Task> getTasksByStatus(@PathVariable Task.Status status) {
        return taskService.getTaskByStatus(status);
    }

    //4. Изменение статуса задач
    @PutMapping("/set_status/{id}/{status}")
    public Task updateTaskStatus(@PathVariable Long id, @PathVariable Task.Status status) {
        return taskService.updateTaskStatus(id, status);
    }

    //5. Удаление задачи
    @DeleteMapping("/delete/{id}")
    public void deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
    }
}
