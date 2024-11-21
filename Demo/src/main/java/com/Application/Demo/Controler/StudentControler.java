package com.Application.Demo.Controler;

import com.Application.Demo.Services.StudentServiceImpl;
import com.Application.Demo.module.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/students")
public class StudentControler {

    @Autowired
    private StudentServiceImpl studentService;

    @PostMapping("/create")
    public ResponseEntity<String> createStudent(@RequestBody Student student) {
        String response = studentService.createStudent(student);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateStudent(@RequestBody Student student) {
        String response = studentService.updateStudent(student);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable("id") Integer id) {
        String response = studentService.deleteStudent(id);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/details")
    public ResponseEntity<Iterable<Student>> getStudentDetails() {
        Iterable<Student> students = studentService.getStudentDetails();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }
}

