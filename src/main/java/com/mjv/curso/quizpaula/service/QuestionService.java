package com.mjv.curso.quizpaula.service;

import com.mjv.curso.quizpaula.model.Question;
import com.mjv.curso.quizpaula.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class QuestionService {
    @Autowired
    private QuestionRepository questionRepository;

    //salvarQuestão
    public Question saveQuestion(Question question) {
        return questionRepository.save(question);
    }

    //atualizarQuestão
    public Optional<Question> searchId (Long id) {
        return questionRepository.findById(id);
    }

    //apagarQuestão
    public void deleteQuestion(Question question) {
        questionRepository.delete(question);
    }
}