package com.mjv.quizpaula;

import com.mjv.quizpaula.model.Alternative;
import com.mjv.quizpaula.model.Question;
import com.mjv.quizpaula.model.User;
import com.mjv.quizpaula.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest

public class UserTest {
    @Autowired
    private UserService userService;

    @Test
    void crudUserTest() {
        //Salvar um usuário
         User userSave = new User("João", "João Vasconcelos",15,"jv@email.com.br");
         userService.save(userSave);
         System.out.println("Usuário cadastrado:" + userSave);

        //Salvar uma lista de usuários
        List<User> userList = getUserList();
        userService.saveList(userList);
        System.out.println("lista salva" + userList);

        //Atualizar um usuário
        userSave.setAge(18);
        userService.save(userSave);
        System.out.println("Foi realizada uma alteração no cadastro:" + userSave);

        //Apagar um usuário
        userService.delete(userSave);
        System.out.println("Usuário apagado!");

    }

    private List<User> getUserList() {
        List<User> userList = new ArrayList<>();

        User newUser = new User("Paula", "Paula Flores",29,"pf@email.com.br");
        User newUser1= new User("Paulo", "Paulo Silva",32,"ps@email.com.br");
        User newUser2= new User("Jota", "Jota Borges",23,"jb@email.com.br");
        User newUser3 = new User("Roger", "Roger Filho ",40,"rf@email.com.br");
        User newUser4 = new User("Tiago", "Tiago Mendes",17,"tm@email.com.br");

        userList.add(newUser);
        userList.add(newUser1);
        userList.add(newUser2);
        userList.add(newUser3);
        userList.add(newUser4);

        return userList;
    }

}