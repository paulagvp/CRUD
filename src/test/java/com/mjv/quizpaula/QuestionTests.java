package com.mjv.quizpaula;

import com.mjv.quizpaula.model.Question;
import com.mjv.quizpaula.service.QuestionService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class QuestionTests {

	@Autowired
	private QuestionService questionService;
	@Test
	void crudQuestionTest(){

		//Salvar uma questão
		Question questionSave = new Question("Qual o comando para adicionar um repositório local o um remoto no Git?", "Git");
		questionService.save(questionSave);
		System.out.println("Questão salva:" + questionSave);

		//Salvar uma lista de questões
		List<Question> questionList = getQuestionList();
		questionService.saveList(questionList);
		System.out.println("lista de questões salva." + questionList);

		//Atualizar uma questão
		questionSave.setTheme("GitHub");
		questionService.save(questionSave);
		System.out.println("Foi feita a alteração do tema para:" + questionSave);

		//Apagar uma questão
		questionService.delete(questionSave);
		System.out.println("Questão apagada.");
	}

	private List<Question>  getQuestionList() {
		List<Question> questionList = new ArrayList<>();

		Question newQuestion = new Question ("Qual o comando para adicionar as alterações de um repositório local ao remoto no Git?", "Git");
		Question newQuestion1= new Question ("Qual o comando para adicionar as alterações de um repositório remoto ao local no Git?", "Git");
		Question newQuestion2= new Question ("Qual o comando utilizado para capturar o estado de um projeto naquele momento.?", "Git");

		questionList.add(newQuestion);
		questionList.add(newQuestion1);
		questionList.add(newQuestion2);

		return questionList;
	}

}
