package com.example.projeto1.model.config;

import com.example.projeto1.model.entity.Usuario;
import com.example.projeto1.model.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataInitializer implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    UserRepository userRepository;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        List<Usuario> usuarios = userRepository.findAll();
        if (usuarios.isEmpty()) {
            criarUsuario("romualdo@gmail.com", "romualdo");
            criarUsuario("maria@gmail.com", "maria");
            criarUsuario("joao@gmail.com", "joao");
        }

        System.out.println(userRepository.findUsuariosByName("maria").getName());
    }

    private void criarUsuario(String email, String nome) {
        userRepository.save(new Usuario(nome, email));

    }


}
