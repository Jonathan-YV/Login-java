package com.generation.SpringSecurityJWT;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringSecurityJWT {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityJWT.class, args);
	}
	
	public Integer suma() {
		int a = 10;
		int b = 5;
		int resultado = a+b;
		return resultado;
	}

}
