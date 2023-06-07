package com.example.projeto1.model.repository;

import com.example.projeto1.model.entity.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface UserRepository extends MongoRepository<Usuario, Long> {

    @Query("{ 'name' : ?0 }")
    Usuario findUsuariosByName(String nome);

    Usuario findUsuarioByNameLike(String nome);
}

