package com.epam.springDataJpa.Application.modle.Unidirectional;

import com.epam.springDataJpa.Application.modle.Author;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
//unidirectional
    @ManyToMany
    @JoinTable(name="Course_author",
    joinColumns = @JoinColumn(name="course_id"),inverseJoinColumns = @JoinColumn(name="author_id"))
    private List<Author> author_list;
}
