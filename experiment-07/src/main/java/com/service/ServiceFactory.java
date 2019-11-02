package com.service;

import com.service.impl.UserServiceImpl;

public class ServiceFactory {
    private static final UserService userService = create();

    private static UserService create() {
        return new UserServiceImpl();
    }
    public static UserService getUserService() {
        return userService;
    }
}
