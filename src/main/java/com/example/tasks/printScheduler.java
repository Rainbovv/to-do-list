//package com.example.tasks;
//
//import com.example.repos.TaskRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.stereotype.Component;
//
//@Component
//public class printScheduler {
//
//    @Autowired
//    TaskRepo taskRepo;
//
//    @Scheduled(initialDelay = 10000, fixedRate = 10000)
//    public void printTheMessage() {
//
////        System.err.println("getting tasks");
//        System.out.println(taskRepo.getAllTasks());
//    }
//}
