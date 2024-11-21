package com.epam.aiChatBot.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "business_ideas")
@Data
public class BusinessIdea {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String idea;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    @OneToMany(mappedBy = "businessIdea", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<IdeaQuestionAnswer> questionAnswers = new ArrayList<>();

}