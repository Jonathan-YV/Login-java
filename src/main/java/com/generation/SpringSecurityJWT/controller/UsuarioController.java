package com.generation.SpringSecurityJWT.controller;

import com.generation.SpringSecurityJWT.model.Usuario;
import com.generation.SpringSecurityJWT.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@RestController
@RequestMapping("/api/user")
public class UsuarioController {

    private final UsuarioService userService;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public UsuarioController(@Autowired UsuarioService userService,@Autowired BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.userService = userService;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @PostMapping
    public Usuario saveUser(@RequestBody Usuario user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        return userService.save(user);
    }

    @GetMapping("/{id}")
    public Usuario getUser(@PathVariable Long id) {
        return userService.getUser(id);
    }


    @GetMapping("/all")
    public ArrayList<Usuario> getUsers() {
        return (ArrayList<Usuario>) userService.getUsers();
    }
}
