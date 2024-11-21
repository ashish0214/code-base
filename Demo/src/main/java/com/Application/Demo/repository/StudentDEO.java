package com.Application.Demo.repository;

import com.Application.Demo.module.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface StudentDEO extends CrudRepository<Student,Integer> {
}
