package com.mjv.curso.quizpaula;

import com.mjv.curso.quizpaula.model.Question;
import com.mjv.curso.quizpaula.service.QuestionService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class QuestionTests {

	@Autowired
	private QuestionService questionService;
	@Test
	void chamaSequenciaCrud() {
		Question questionQueQueroSalvar = new Question("Cinema","Qual o nome do cinema que tem no shopping Recife?","UCI");
		questionService.saveQuestion(questionQueQueroSalvar);
		System.out.println("Retorno salvado:" + questionQueQueroSalvar);
	}

}
