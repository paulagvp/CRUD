package com.mjv.curso.myfristcrud.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class QuestionAlternative {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String alternative;
    private boolean corretAlternative;

}
