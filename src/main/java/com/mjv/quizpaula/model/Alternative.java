package com.mjv.quizpaula.model;
import jakarta.persistence.*;
@SequenceGenerator(name = "tb_alternativas_seq", allocationSize = 1)
@Entity
@Table(name = "tb_alternativas")

public class Alternative {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "alternativa")
    private String alternative;

    @Column(name = "alternativa_correta")
    private Boolean correctAlternative;

    public Alternative(){
    }

    public Alternative(Long id, String alternative, Boolean correctAlternative) {
        this.id = id;
        this.alternative = alternative;
        this.correctAlternative = correctAlternative;
    }

    public Alternative(String alternative, Boolean correctAlternative) {
        this.alternative = alternative;
        this.correctAlternative = correctAlternative;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAlternative() {
        return alternative;
    }

    public void setAlternative(String alternative) {
        this.alternative = alternative;
    }

    public Boolean getCorrectAlternative() {
        return correctAlternative;
    }

    public void setCorrectAlternative(Boolean correctAlternative) {
        this.correctAlternative = correctAlternative;
    }


    @Override
    public String toString() {
        return "Alternative{" +
                "id=" + id +
                ", alternative='" + alternative + '\'' +
                ", correctAlternative=" + correctAlternative +
                '}';
    }
}