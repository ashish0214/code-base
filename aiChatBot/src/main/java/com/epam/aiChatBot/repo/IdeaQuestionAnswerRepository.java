package com.epam.aiChatBot.repo;

import com.epam.aiChatBot.model.IdeaQuestionAnswer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IdeaQuestionAnswerRepository extends JpaRepository<IdeaQuestionAnswer,Long> {
}
