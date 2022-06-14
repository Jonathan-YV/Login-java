package com.generation.SpringSecurityJWT.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, name = "id_usuario")
    private Long id;

    @Column(nullable = false, length = 200, name = "nombre")
    private String nombre;

    @Column(nullable = false, length = 200, name = "apellido")
    private String apellido;

    @Column(nullable = false, length = 255, name = "correo", unique = true)
    private String correo;

    @Column(nullable = false, length = 255, name = "password")
    private String password;
    
    @Column(nullable = true, length = 255, name = "direccion")
    private String direccion;

    @OneToMany(mappedBy = "usuario")
    private List<Post> posts;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public List<Post> getPosts() {
		return posts;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}

    
}
