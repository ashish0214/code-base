package com.Application.Demo.Services;

import com.Application.Demo.module.Student;
import com.Application.Demo.repository.StudentDEO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class StudentServiceImpl {
    @Autowired
    private StudentDEO studentDEO;


    public String createStudent(Student student) {
        studentDEO.save(student);
        return "Successfully Student created";
    }


    public String updateStudent(Student student) {
        Optional<Student> element = studentDEO.findById(student.getId());
        element.ifPresent(ele-> studentDEO.save(student));
        return "Successfully Student updated";
    }


    public String deleteStudent(Integer id) {
        Optional<Student> element = studentDEO.findById(id);
        element.ifPresent(ele -> studentDEO.delete(ele));
        return "Successfully Student deleted";
    }


    public Iterable<Student> getStudentDetails() {
        return studentDEO.findAll();

    }


}
