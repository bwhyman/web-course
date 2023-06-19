package com.entity;

import java.time.LocalDateTime;

public class User {
    private String id;
    private String name;
    private LocalDateTime insertTime;

    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public User(String id, String name, LocalDateTime insertTime) {
        this.id = id;
        this.name = name;
        this.insertTime = insertTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(LocalDateTime insertTime) {
        this.insertTime = insertTime;
    }
}
