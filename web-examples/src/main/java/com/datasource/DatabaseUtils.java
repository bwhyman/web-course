package com.datasource;

import com.datasource.entity.Course;
import com.datasource.entity.Teacher;
import com.datasource.entity.Title;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class DatabaseUtils {
    private static final List<Course> COURSES = createCourses();
    private static final List<Title> TITLES = createTitles();
    private static final List<Teacher> TEACHERS = createTeachers();
    private static List<Course> createCourses() {
        Course c1 = new Course(1, "Java程序设计", "Java程序设计是一门必修课", new Date());
        Course c2 = new Course(3, "Web开发技术", "Web开发技术讨论页面开发技术", new Date());
        Course c3 = new Course(4, "数据库原理", "数据库原理考研", new Date());
        Course c4 = new Course(7, "系统分析与设计", "系统分析与设计很难", new Date());
        return List.of(c1, c2, c3, c4);
    }

    public static List<Course> listCourses() {
        return COURSES;
    }

    public static Course getCourse(int id) {
        return COURSES.stream()
                .filter(c -> c.getId() == id)
                .findFirst()
                .orElse(null);
    }

    private static List<Title> createTitles() {
        Title t1 = new Title(1, "讲师");
        Title t2 = new Title(2, "副教授");
        Title t3 = new Title(3, "教授");
        return List.of(t1, t2, t3);
    }

    public static List<Title> listTitles() {
        return TITLES;
    }

    public static Title getTitle(int id) {
        return TITLES.stream()
                .filter(t -> t.getId() == id)
                .findFirst().orElse(null);
    }

    private static List<Teacher> createTeachers() {
        List<Course> cs1 = List.of(getCourse(1), getCourse(7));
        Teacher t1 = new Teacher(12, "BO", getTitle(1), cs1);
        Teacher t2 = new Teacher(13, "SUN", getTitle(2), cs1);
        Teacher t3 = new Teacher(16, "ZHANG", getTitle(3), cs1);
        Teacher t4 = new Teacher(56, "ZHAO", getTitle(1), cs1);
        return List.of(t1, t2, t3, t4);
    }

    public static List<Teacher> listTeacherByTitle(int tid) {
        return TEACHERS.stream()
                .filter(t -> t.getTitle().getId() == tid)
                .collect(Collectors.toList());
    }
}
