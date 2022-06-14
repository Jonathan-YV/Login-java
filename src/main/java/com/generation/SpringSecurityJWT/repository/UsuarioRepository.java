package com.generation.SpringSecurityJWT.repository;

import com.generation.SpringSecurityJWT.model.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

    Usuario findByCorreo(String correo);
}
