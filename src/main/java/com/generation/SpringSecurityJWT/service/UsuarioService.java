package com.generation.SpringSecurityJWT.service;

import com.generation.SpringSecurityJWT.model.Usuario;

import java.util.List;

public interface UsuarioService {

    Usuario getUser(Long id);

    List<Usuario> getUsers();

    Usuario save(Usuario user);

    void delete(Long id);
    
   
}
