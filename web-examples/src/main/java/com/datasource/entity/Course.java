package com.datasource.entity;

import java.time.LocalDateTime;
import java.util.Date;

public class Course {
    private int id;
    private String name;
    private String description;
    private LocalDateTime insertTime;

    public Course() {
    }

    public Course(int id, String name, String description, LocalDateTime insertTime) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.insertTime = insertTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public LocalDateTime getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(LocalDateTime insertTime) {
        this.insertTime = insertTime;
    }
}
