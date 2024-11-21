package com.Application.Demo;

import com.Application.Demo.Services.StudentServices;
import com.Application.Demo.module.Student;
import org.springframework.beans.factory.annotation.Autowired;

public class Main {
    private static StudentServices studentServices;

    @Autowired
    public Main(StudentServices studentServices) {
        this.studentServices=studentServices;
    }

    void start(){
    Student student=new Student(1,"Ashish","Rana");
    Student student1=new Student(1,"Rohith","Rana");


		studentServices.createStudent(student);

		studentServices.deleteStudent(1);

		studentServices.updateStudent(student1);

    Iterable<Student> displayStudent=studentServices.getStudentDetails();
		for (Student s1:displayStudent){
        System.out.println(s1);
    }}
}
