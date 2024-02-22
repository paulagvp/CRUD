package com.mjv.quizpaula;

import com.mjv.quizpaula.model.Alternative;
import com.mjv.quizpaula.service.AlternativeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class AlternativeTest{
    @Autowired
    private AlternativeService alternativeService;

    @Test
    public void crudAlternativeTest() {

        //Salvar uma alternativa
        Alternative alternativeSave = new Alternative("git remote add", true);
        alternativeService.save(alternativeSave);
        System.out.println("Alternativa:" + alternativeSave);

        //Salvar uma lista de alternativas
        List<Alternative> alternativeList = getAlternativeList();
        alternativeService.saveList(alternativeList);
        System.out.println("lista salva" + alternativeList);

        //Atualizar uma alternativa
        alternativeSave.setCorrectAlternative(false);
        alternativeService.save(alternativeSave);
        System.out.println("Foi realizada uma alteração na alternativa:" + alternativeSave);

       //Apagar uma alternativa
        alternativeService.delete(alternativeSave);
        System.out.println("Alternativa apagada!");
    }

    private List<Alternative> getAlternativeList() {
        List<Alternative> alternativeList = new ArrayList<>();

        Alternative alternativeA = new Alternative("git remote add",true);
        Alternative alternativeB = new Alternative("git clone", false);
        Alternative alternativeC = new Alternative("git pull", false);
        Alternative alternativeD = new Alternative("git push", false);

        alternativeList.add(alternativeA);
        alternativeList.add(alternativeB);
        alternativeList.add(alternativeC);
        alternativeList.add(alternativeD);

        return alternativeList;
    }
}