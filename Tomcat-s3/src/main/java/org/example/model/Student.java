package org.example.model;
import java.util.ArrayList;
import java.util.List;

public class Student {

    private String code;
    //Example: A00123456

    private String name;

    private String program;

    private List<Course> courses;

    //Constructors
    public Student (){
        courses = new ArrayList<>();
    }

    //Getters y setters
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void removeCourse(Course course) {
        courses.remove(course);
    }

    public void removeCourse(int id) {
        for (Course course : courses) {
            if (course.getId() == id) {
                courses.remove(course);
                break;
            }
        }
    }

    public Course getCourse(int id) {
        for (Course course : courses) {
            if (course.getId() == id) {
                return course;
            }
        }
        return null;
    }

    public boolean hasCourse(int id) {
        for (Course course : courses) {
            if (course.getId() == id) {
                return true;
            }
        }
        return false;
    }
}
