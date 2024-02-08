package com.mjv.curso.myfristcrud.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_question")


public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String theme;
    private String question;
    private String resposta;

    public Question(){
    }
    public Question(Long id, String theme, String question) {
        this.id = id;
        this.theme = theme;
        this.question = question;
        this.resposta = resposta;
    }

    public Question(String theme, String question) {
        this.theme = theme;
        this.question = question;
        this.resposta = resposta;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", theme='" + theme + '\'' +
                ", question='" + question + '\'' +
                ", resposta='" + resposta + '\'' +
                '}';
    }
}
