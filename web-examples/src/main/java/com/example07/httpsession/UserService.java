package com.example07.httpsession;

import com.datasource.entity.User;

public class UserService {
    public static User login(String userName) {
        User user = null;
        if (userName.equals("user")) {
            user = new User();
            user.setName("BO");
            user.setRole(User.USER);
        }
        if (userName.equals("admin")) {
            user = new User();
            user.setName("admin");
            user.setRole(User.ADMIN);
        }
        return user;
    }
}
