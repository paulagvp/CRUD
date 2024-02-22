package com.mjv.quizpaula.model;
import jakarta.persistence.*;
@SequenceGenerator(name = "tb_usuario_seq", allocationSize = 1)
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

    @Column(name = "email")
    private String email;

    public User(){
    }

    public User(Long id, String name, String fullName, Integer age, String email) {
        this.id = id;
        this.name = name;
        this.fullName = fullName;
        this.age = age;
        this.email = email;
    }

    public User(String name, String fullName, Integer age, String email) {
        this.name = name;
        this.fullName = fullName;
        this.age = age;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
