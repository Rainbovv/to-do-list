package com.example.services;

import com.example.domain.entities.Task;
import com.example.repos.TaskRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    TaskRepo taskRepo;

    public List<Task> getAllTasks() {
        return taskRepo.findAll();
    }

    public void addTask(Task task) {
        taskRepo.save(task);
    }

    public void removeTaskById(Integer id) {
        taskRepo.deleteById(id);
    }
    public void updateTaskById(Task task, Integer id) {
        taskRepo.deleteById(id);
        task.setId(id);
        taskRepo.save(task);
    }
}
