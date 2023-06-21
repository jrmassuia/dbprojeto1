package com.example.projeto1.model.service;

import com.example.projeto1.model.entity.Usuario;
import com.example.projeto1.model.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<Usuario> findAll(){
        return userRepository.findAll();
    }
}
