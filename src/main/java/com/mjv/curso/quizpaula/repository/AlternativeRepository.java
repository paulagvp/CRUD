package com.mjv.curso.quizpaula.repository;

import com.mjv.curso.quizpaula.model.Alternative;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlternativeRepository extends JpaRepository<Alternative, Long> {
}