package org.example.repository;

import org.example.model.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseRepository {
    private List<Course> courses = new ArrayList<>();

    public List<Course> findAll() {
        return courses;
    }

    public void save(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
        }
        System.out.println("Course length: " + courses.size());
    }

    public boolean exists(String name) {
        for (Course course : courses) {
            if (course.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public boolean exists(int id) {
        for (Course course : courses) {
            if (course.getId() == id) {
                return true;
            }
        }
        return false;
    }

    public Course findByName(String name) {
        for (Course course : courses) {
            if (course.getName().equals(name)) {
                return course;
            }
        }
        return null;
    }

    public Course findById(int id) {
        for (Course course : courses) {
            if (course.getId() == id) {
                return course;
            }
        }
        return null;
    }
}