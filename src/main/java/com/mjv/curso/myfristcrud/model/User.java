package com.mjv.curso.myfristcrud.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_usuario")
public class User {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String name;

    @Column(name = "nome_completo")
    private String fullName;

    @Column(name = "idade")
    private Integer age;

    @Column(name = "e-mail")
    private String email;

    @Column(name = "senha")
    private String password;

}
