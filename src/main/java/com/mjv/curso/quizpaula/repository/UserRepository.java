package com.mjv.curso.quizpaula.repository;

import com.mjv.curso.quizpaula.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long> {

}
