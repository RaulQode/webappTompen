package org.example.service;
import org.example.model.Course;
import org.example.model.Student;
import org.example.repository.CourseRepository;
import org.example.repository.StudentRepository;

import java.util.List;

public class StudentService {
    
    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;

    }

    public void init(){
        // create objects

        Course course1 = new Course();
        course1.setId(59);
        course1.setName("Computación en Internet 2");
        course1.setProfessorName("Alejandro Muñoz");
        course1.setSchedule("MA 14:00 15:59, JU 14:00 15:59");

        Course course2 = new Course();
        course2.setId(23);
        course2.setName("Comunicación oral y escrita 2");
        course2.setProfessorName("Andres García");
        course2.setSchedule("MI 14:00 15:59");

        Course course3 = new Course();
        course3.setId(17);
        course3.setName("Ingeniería de Software 4");
        course3.setProfessorName("Gabriel Tamura");
        course3.setSchedule("MA 07:00 08:59, JU 07:00 08:59");

        Course course4 = new Course();
        course4.setId(12);
        course4.setName("Psicología Organizacional");
        course4.setProfessorName("Saryth Valencia");
        course4.setSchedule("VI 11:00 13:00");


        Student student1 = new Student();
        student1.setCode("A00111111");
        student1.setName("Andrea Rodriguez");
        student1.setProgram("Ingeniería de Sistemas");
        student1.getCourses().addAll(List.of(course1, course2, course3));
        studentRepository.save(student1);

        Student student2 = new Student();
        student2.setCode("A00222222");
        student2.setName("Blanca Gutiérrez");
        student2.setProgram("Ingeniería de Sistemas");
        student2.getCourses().addAll(List.of(course1, course3));
        studentRepository.save(student2);

        Student student3 = new Student();
        student3.setCode("A00333333");
        student3.setName("Carlos Zapata");
        student3.setProgram("Psicología");
        student3.getCourses().addAll(List.of(course2, course4));
        studentRepository.save(student3);

    }

    public void addStudent(Student student){
        studentRepository.save(student);
    }

    public Student getStudent(String code){
        return studentRepository.findByCode(code);
    }
}
