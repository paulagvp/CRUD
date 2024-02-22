package com.mjv.quizpaula.repository;

import com.mjv.quizpaula.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long> {

}
