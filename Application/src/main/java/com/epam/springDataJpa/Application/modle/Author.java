package com.epam.springDataJpa.Application.modle;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Entity
@Table(name = "Author_Table")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String firstName;
    private String lastname;
    @Column(unique = true ,nullable = false)
    private String email;
    private Integer age;
    @Column(insertable = false,updatable = false,nullable = false)
    private LocalDateTime createdAt;
}
