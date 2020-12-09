package com.example05.filter;

import java.time.LocalDateTime;

public class User {
    private String name;
    private LocalDateTime loginTime;

    public User(String name, LocalDateTime loginTime) {
        this.name = name;
        this.loginTime = loginTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(LocalDateTime loginTime) {
        this.loginTime = loginTime;
    }
}
