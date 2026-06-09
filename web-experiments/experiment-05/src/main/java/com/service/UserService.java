package com.service;

import java.time.LocalDateTime;
import java.util.List;

import com.entity.Course;
import com.entity.Teacher;
import com.entity.Title;

public class UserService {
    private static final List<Title> titles = createTitles();
    private static final List<Course> courses = createCourses();
    private static final List<Teacher> teachers = createTeachers();
    
    private static List<Title> createTitles() {
        Title t1 = new Title(1, "讲师");
        Title t2 = new Title(2, "副教授");
        Title t3 = new Title(3, "教授");
        return List.of(t1, t2, t3);
    }
    
    private static List<Course> createCourses() {
        Course c1 = new Course(1, "Web开发技术");
        Course c2 = new Course(2, "Java程序设计");
        Course c3 = new Course(3, "数据库原理");
        Course c4 = new Course(4, "软件项目管理");
        return List.of(c1, c2, c3, c4);
    }
    
    private static List<Teacher> createTeachers() {
        var time1 = LocalDateTime.of(2046, 7, 8, 9, 27);
        var time2 = LocalDateTime.of(2046, 10, 23, 14, 44);
        // 模拟2个教师
        var cs1 = List.of(courses.get(0), courses.get(3));
        var t1 = titles.get(2);
        Teacher teacher1 = new Teacher(1, "唐晨阳", cs1, t1, time1);

        var cs2 = List.of(courses.get(1), courses.get(2));
        var t2 = titles.get(1);
        Teacher teacher2 = new Teacher(2, "刘春枝", cs2, t2, time2);
        return List.of(teacher1, teacher2);
    }

    public static List<Title> listTitles() {
        return titles;
    }

    public static List<Course> listCourses() {
        return courses;
    }
    public static List<Teacher> listTeachers() {
        return teachers;
    }

    // 获取指定ID的教师
    public static Teacher getTeacher(int id) {
        return teachers.stream()
                .filter(t -> t.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
