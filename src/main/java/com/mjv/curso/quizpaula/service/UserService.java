package com.mjv.curso.quizpaula.service;

import com.mjv.curso.quizpaula.model.Question;
import com.mjv.curso.quizpaula.model.User;
import com.mjv.curso.quizpaula.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    //salvar vários usuários em lista
    public List<User> saveListUser(List<User> userList){
        return userRepository.saveAll(userList);
    }

    //salvarUsuário
    public User saveUser(User user) {

        return userRepository.save(user);
    }

    //apagarUsuário
    public void deleteUser(User user) {
        userRepository.delete(user);
    }
}

