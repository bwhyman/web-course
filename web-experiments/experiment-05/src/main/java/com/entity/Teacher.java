package com.entity;

import java.time.LocalDateTime;
import java.util.List;

public class Teacher {
    private Integer id;
    private String name;
    private List<Course> courses;
    private Title title;
    private LocalDateTime createTime;

    public Teacher() {
    }

    public Teacher(Integer id, String name, List<Course> courses, Title title, LocalDateTime createTime) {
        this.id = id;
        this.name = name;
        this.courses = courses;
        this.title = title;
        this.createTime = createTime;
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

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }
}
