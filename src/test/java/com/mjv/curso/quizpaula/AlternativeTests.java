package com.mjv.curso.quizpaula;

import com.mjv.curso.quizpaula.model.Alternative;
import com.mjv.curso.quizpaula.service.AlternativeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class AlternativeTests {
    @Autowired
    private AlternativeService alternativeService;

    @Test
    void chamaSequenciaCrud(){
        List<Alternative> alternativeList = getListaAlternativaValores();

        alternativeService.saveList(alternativeList);
        System.out.println("lista salva" + alternativeList);

        alternativeService.deleteList(alternativeList);
        System.out.println("Lista deletada.");
    }

    private List<Alternative> getListaAlternativaValores() {
        List<Alternative> alternativeList = new ArrayList<>();

        Alternative testeParaSalvarAlternativa = new Alternative("A", false);
        Alternative testeParaSalvarAlternativa1 = new Alternative("B", false);
        Alternative testeParaSalvarAlternativa2 = new Alternative("C", false);
        Alternative testeParaSalvarAlternativa3 = new Alternative("D", true);

        alternativeList.add(testeParaSalvarAlternativa1);
        alternativeList.add(testeParaSalvarAlternativa2);
        alternativeList.add(testeParaSalvarAlternativa3);
        alternativeList.add(testeParaSalvarAlternativa);

        return alternativeList;
    }

}
