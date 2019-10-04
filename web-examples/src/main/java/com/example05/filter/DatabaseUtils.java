package com.example05.filter;

import java.time.LocalDateTime;

public class DatabaseUtils {
    public static User getUser(String userName, String password) {
        User user = null;
        //  模拟，用户登录成功返回封装登录时间及姓名的对象
        if ("BO".equals(userName) && "123456".equals(password)) {
            user = new User("王小明", LocalDateTime.now());
        }
        return user;
    }
}
