package com.example.projeto1.model.repository;

import com.example.projeto1.model.entity.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<Usuario, Long> {

    Usuario findUsuariosByName(String nome);
}

