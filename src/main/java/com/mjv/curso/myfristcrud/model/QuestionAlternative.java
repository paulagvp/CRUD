package com.mjv.curso.myfristcrud.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import org.springframework.util.AlternativeJdkIdGenerator;

public class QuestionAlternative {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String alternative;
    private boolean corretAlternative;

    private List<QuestionAlternative> questionAlternativeList;

}
