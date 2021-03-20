package com.example.domain.entities;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "task_name", length = 50, unique = true)
    private String name;
    private String description;
    private Timestamp deadline;

    @Column(name = "is_done", columnDefinition = "boolean default false")
    private boolean isDone;

    public Task() {}

    public Task(String name, String description, Timestamp deadLine) {
        this.name = name;
        this.description = description;
        this.deadline = deadLine;
    }

    public Task(Integer id, String name, String description, Timestamp deadline, boolean isDone) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.deadline = deadline;
        this.isDone = isDone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Timestamp getDeadline() {
        return deadline;
    }

    public void setDeadline(Timestamp deadline) {
        this.deadline = deadline;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", deadline=" + deadline +
                ", isDone=" + isDone +
                '}';
    }
}
