package com.mjv.curso.myfristcrud.repository;

import com.mjv.curso.myfristcrud.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long> {
}
