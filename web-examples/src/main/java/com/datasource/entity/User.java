package com.datasource.entity;

import java.time.LocalDateTime;

public class User {
    public static final int ADMIN = 5;
    public static final int USER = 1;

    private Integer id;
    private String userName;
    private String password;
    private Integer role;
    private String name;
    private Address address;
    private LocalDateTime loginTime;
    private LocalDateTime insertTime;

    public User() {
    }

    public User(String name, LocalDateTime loginTime) {
        this.name = name;
        this.loginTime = loginTime;
    }

    public User(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(LocalDateTime insertTime) {
        this.insertTime = insertTime;
    }
}
