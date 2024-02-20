package com.mjv.curso.myfristcrud.repository;

import com.mjv.curso.myfristcrud.model.Alternative;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlternativeRepository extends JpaRepository<Alternative, Long> {
}
