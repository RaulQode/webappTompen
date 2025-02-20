package org.example.repository;

import org.example.model.Course;
import org.example.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {

    private CourseRepository courseRepository;

    public StudentRepository(CourseRepository courseRepository){
        this.courseRepository = courseRepository;
    }

    private List<Student> students = new ArrayList<>();

    public List<Student> findAll() {
        return students;
    }

    public void save(Student student) {
        for (Course course: student.getCourses()){
            courseRepository.save(course);
        }
    }

    public void init(){

    }

    public Student findByCode(String code){
        for (Student student: students){
            if (student.getCode().equals(code)){
                return student;
            }
        }
        return null;
    }
}