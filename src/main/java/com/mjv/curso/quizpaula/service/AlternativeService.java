package com.mjv.curso.quizpaula.service;

import com.mjv.curso.quizpaula.model.Alternative;
import com.mjv.curso.quizpaula.repository.AlternativeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlternativeService {

    @Autowired
    private  AlternativeRepository alternativeRepository;

    //salvarQuestão
    public Alternative save(Alternative alternative) {
        return alternativeRepository.save(alternative);
    }

    public List<Alternative> saveList(List<Alternative> alternativeList) {
        return alternativeRepository.saveAll(alternativeList);
    }

    //atualizarQuestão
    public Optional<Alternative> findAll(Long id) {
        return alternativeRepository.findById(id);
    }
    //listar todas as alternativas
    public List<Alternative> findAll() {
        return alternativeRepository.findAll();
    }

    //apagarQuestão
    public void delete(Alternative alternative) {
        alternativeRepository.delete(alternative);
    }

    public void deleteList(List<Alternative> alternativeList){
        alternativeRepository.deleteAllInBatch(alternativeList);
    }


}
