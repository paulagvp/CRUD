package com.mjv.curso.quizpaula.model;
import jakarta.persistence.*;

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
    private Boolean corretAlternative;

    public Alternative(){

    }
    public Alternative(Long id, String alternative, Boolean corretAlternative) {
        this.id = id;
        this.alternative = alternative;
        this.corretAlternative = corretAlternative;
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

    public Boolean getCorretAlternative() {
        return corretAlternative;
    }

    public void setCorretAlternative(Boolean corretAlternative) {
        this.corretAlternative = corretAlternative;
    }


    @Override
    public String toString() {
        return "Alternative{" +
                "id=" + id +
                ", alternative='" + alternative + '\'' +
                ", corretAlternative=" + corretAlternative +
                '}';
    }
}