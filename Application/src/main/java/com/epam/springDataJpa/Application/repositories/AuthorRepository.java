package com.epam.springDataJpa.Application.repositories;

import com.epam.springDataJpa.Application.modle.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author,Integer> {

}
