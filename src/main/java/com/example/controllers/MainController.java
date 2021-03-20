package com.example.controllers;

import com.example.domain.entities.Task;
import com.example.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@CrossOrigin(origins = "http://localhost:4200")
public class MainController {

    @Autowired
    TaskService taskService;

    @GetMapping("/")
    public List<Task> index() {
        return taskService.getAllTasks();
    }

    @PostMapping(value = "/new", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void create(@RequestBody Task task) {
        taskService.addTask(task);
    }

    @PutMapping(value = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void update(@RequestBody Task task, @RequestParam Integer id) {
        taskService.updateTaskById(task, id);
    }
}
