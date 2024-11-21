package com.epam.aiChatBot.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "idea_questions_answers")
@Getter
@Setter
public class IdeaQuestionAnswer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "business_idea_id", nullable = false)
    private BusinessIdea businessIdea;

    @Column(name = "Question", nullable = false)
    private String question;

    @Column(name = "answer")
    private String answer;

}
