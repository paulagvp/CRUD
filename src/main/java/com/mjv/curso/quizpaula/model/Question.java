package com.mjv.curso.quizpaula.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_questões")


public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "tema")
    private String theme;
    @Column(name = "questão")
    private String question;
    @Column(name = "resposta")
    private String answer;

    public Question(){
    }

    public Question(Long id, String theme, String question, String answer) {
        this.id = id;
        this.theme = theme;
        this.question = question;
        this.answer = answer;
    }

    public Question(String theme, String question, String answer) {
        this.theme = theme;
        this.question = question;
        this.answer = answer;
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

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }


    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", theme='" + theme + '\'' +
                ", question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }

    public static final class Builder {
        private Long id;
        private String theme;
        private String question;
        private String answer;

        public Builder() {
        }

        public Builder(Question other) {
            this.id = other.id;
            this.theme = other.theme;
            this.question = other.question;
            this.answer = other.answer;
        }

        public static Builder aQuestion() {
            return new Builder();
        }

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder theme(String theme) {
            this.theme = theme;
            return this;
        }

        public Builder question(String question) {
            this.question = question;
            return this;
        }

        public Builder answer(String answer) {
            this.answer = answer;
            return this;
        }

        public Question build() {
            Question question = new Question();
            question.setId(id);
            question.setTheme(theme);
            question.setQuestion(String.valueOf(question));
            question.setAnswer(answer);
            return question;
        }
    }
}
