package com.mjv.quizpaula.service;

import com.mjv.quizpaula.model.Alternative;
import com.mjv.quizpaula.model.User;
import com.mjv.quizpaula.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    //salvar um usuário
    public User save(User user){
        return userRepository.save(user);
    }

    //salvar uma lista de usuários
    public List<User> saveList(List<User> userList) {
        return userRepository.saveAll(userList);
    }

    //atualizar um usuário
    public Optional<User> searchId (Long id){
        return userRepository.findById(id);
    }

    //apagar uma lista de usuários
    public void deleteList(List<User> userList){
        userRepository.deleteAllInBatch(userList);
    }

    //apagar um usuário
    public void delete(User user){
        userRepository.delete(user);
    }
}

