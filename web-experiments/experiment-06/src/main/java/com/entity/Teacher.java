package com.entity;

import java.time.LocalDateTime;
import java.util.List;

public class Teacher {
    private int id;
    private String name;
    private List<Course> courses;
    private Title title;
    private LocalDateTime insertTime;

    public Teacher() {
    }

    public Teacher(int id, String name, List<Course> courses, Title title, LocalDateTime insertTime) {
        this.id = id;
        this.name = name;
        this.courses = courses;
        this.title = title;
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

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public LocalDateTime getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(LocalDateTime insertTime) {
        this.insertTime = insertTime;
    }
}
