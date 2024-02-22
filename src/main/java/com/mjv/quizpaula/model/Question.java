package com.mjv.quizpaula.model;

import jakarta.persistence.*;

import java.util.List;

//Para que a geração de ID fique em sequência.
@SequenceGenerator(name = "tb_questoes_seq", allocationSize = 1)
@Entity
@Table(name = "tb_questões")


public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "questão")
    private String question;

    @Column(name = "tema")
    private String theme;

    public Question(){
    }

    public Question(Long id, String question, String theme) {
        this.id = id;
        this.question = question;
        this.theme = theme;
    }

    public Question(String question, String theme) {
        this.question = question;
        this.theme = theme;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", question='" + question + '\'' +
                ", theme='" + theme + '\'' +
                '}';
    }
}

