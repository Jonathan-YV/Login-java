package com.generation.SpringSecurityJWT.service;

import com.generation.SpringSecurityJWT.model.Usuario;
import com.generation.SpringSecurityJWT.repository.UsuarioRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static java.util.Collections.emptyList;

@Service
public class UsuarioServiceImpl implements UsuarioService, UserDetailsService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioServiceImpl(UsuarioRepository userRepository) {
        this.usuarioRepository = userRepository;
    }

    @Override
    public Usuario getUser(Long id) {
        Optional<Usuario> user = usuarioRepository.findById(id);
        return user.orElse(null);
    }

    @Override
    public List<Usuario> getUsers() {
        return (List<Usuario>) usuarioRepository.findAll();
    }

    @Override
    public Usuario save(Usuario user) {
        return usuarioRepository.save(user);
    }

    @Override
    public void delete(Long id) {
    	usuarioRepository.deleteById(id);
    }

    @Override
    public UserDetails loadUserByUsername(String correo) throws UsernameNotFoundException {
        Usuario user = usuarioRepository.findByCorreo(correo);

        if(user == null) {
            throw new UsernameNotFoundException(correo);
        }
        return new org.springframework.security.core.userdetails.User(user.getCorreo(), user.getPassword(), emptyList());
    }

}
