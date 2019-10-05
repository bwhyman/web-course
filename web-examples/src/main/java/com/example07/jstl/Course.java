package com.example07.jstl;

import java.util.Date;

public class Course {
    private int id;
    private String name;
    private String description;
    private Date insertDate;

    public Course(int id, String name, String description, Date insertDate) {
        this.id = id;
        this.name = name;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(Date insertDate) {
        this.insertDate = insertDate;
    }
}
