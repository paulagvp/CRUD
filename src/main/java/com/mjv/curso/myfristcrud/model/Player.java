package com.mjv.curso.myfristcrud.model;
import jakarta.persistence.*;

import java.util.ArrayList;
@Entity
@Table(name = "tb_player")

public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "nickName")
    private String nickName;
    @Column(name = "theme")
    private String theme;
    @Column(name = "user")
    private User user;

    public Player(){

    }
}
