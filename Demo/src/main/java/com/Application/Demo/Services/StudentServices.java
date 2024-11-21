package com.Application.Demo.Services;

import com.Application.Demo.module.Student;

public interface StudentServices {
    public Iterable<Student> getStudentDetails();
    public String deleteStudent(Integer id);
    public String updateStudent(Student student);
    public String createStudent(Student student);
}
