package com.entity;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Teacher {
    private int id;
    private String name;
    private List<Course> courses;
    private Title title;
    private Date insertDate;

    public Teacher(int id, String name, List<Course> courses, Title title, Date insertDate) {
        this.id = id;
        this.name = name;
        this.courses = courses;
        this.title = title;
        this.insertDate = insertDate;
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

    public Date getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(Date insertDate) {
        this.insertDate = insertDate;
    }
}
