package com.mjv.curso.quizpaula.service;

import com.mjv.curso.quizpaula.repository.AlternativeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlternativeService {

    @Autowired
    private  AlternativeRepository alternativeRepository;
}
