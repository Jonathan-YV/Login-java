package com.generation.SpringSecurityJWT;

import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class SpringSecurityJWTTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	void pruebaSuma() {
		SpringSecurityJWT metodoSuma = new SpringSecurityJWT();
		assertEquals(15, metodoSuma.suma());
		
	}

}
