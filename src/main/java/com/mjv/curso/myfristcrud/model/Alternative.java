package com.mjv.curso.myfristcrud.model;
import jakarta.persistence.*;

@Entity
@Table(name = "Tabela de Alternativas")

public class Alternative {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String alternative;
    private Boolean corretAlternative;

}
