package com.mjv.quizpaula.service;

import com.mjv.quizpaula.model.Alternative;
import com.mjv.quizpaula.repository.AlternativeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class AlternativeService {
    @Autowired
    private  AlternativeRepository alternativeRepository;

    //salvar uma alternativa
    public Alternative save(Alternative alternative){
        return alternativeRepository.save(alternative);
    }

    //salvar uma lista de alternativas
    public List<Alternative> saveList(List<Alternative> alternativeList) {
        return alternativeRepository.saveAll(alternativeList);
    }

    //atualizar uma alternativa
    public Optional<Alternative> searchId (Long id){

        return alternativeRepository.findById(id);
    }

    //apagar uma lista de alternativas
    public void deleteList(List<Alternative> alternativeList){
        alternativeRepository.deleteAllInBatch(alternativeList);
    }

    //apagar uma alternativa
    public void delete(Alternative alternative){

        alternativeRepository.delete(alternative);
    }
}
