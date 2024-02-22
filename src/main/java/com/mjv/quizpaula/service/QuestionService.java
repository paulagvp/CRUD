package com.mjv.quizpaula.service;

import com.mjv.quizpaula.model.Question;
import com.mjv.quizpaula.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    //salvar uma questão
    public Question save(Question question) {
        return questionRepository.save(question);
    }

    //salvar uma lista de questões
    public List<Question> saveList(List<Question> questionList) {
        return questionRepository.saveAll(questionList);
    }

    //atualizar uma questão
    public Optional<Question> searchId(Long id) {
        return questionRepository.findById(id);
    }

    //apagar uma lista de questões
    public void deleteList(List<Question> questionList){
        questionRepository.deleteAllInBatch(questionList);
    }

    //apagar uma questão
    public void delete(Question question) {
        questionRepository.delete(question);
    }
}