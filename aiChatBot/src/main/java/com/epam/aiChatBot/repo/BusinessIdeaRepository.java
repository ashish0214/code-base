package com.epam.aiChatBot.repo;

import com.epam.aiChatBot.model.BusinessIdea;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusinessIdeaRepository extends JpaRepository<BusinessIdea, Long> {
}
