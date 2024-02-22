package com.mjv.quizpaula.repository;

import com.mjv.quizpaula.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long> {
}
