package com.mjv.curso.quizpaula.repository;

import com.mjv.curso.quizpaula.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long> {
}
