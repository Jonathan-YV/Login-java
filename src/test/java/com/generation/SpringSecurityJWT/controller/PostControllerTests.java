package com.generation.SpringSecurityJWT.controller;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;


import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PostControllerTests {

	@Test
	@DisplayName("Probando Mockito")
	void pruebaMockito() {
		List<String> listaFalsa = mock(List.class);
		listaFalsa.add("uno");
		listaFalsa.clear();
		
		verify(listaFalsa).add("uno");
		verify(listaFalsa).clear();

	}
	
	@Test
	@DisplayName("Probando a Mockito V2")
	void pruebaMockitoV2() {
		List<String> listaFalsa = mock(List.class);
		
		when(listaFalsa.get(0)).thenReturn("Hola mundo");
		String resultado = listaFalsa.get(0);
		System.out.println(resultado);
		
		verify(listaFalsa).get(0);
		assertEquals("Hola mundo", resultado);
	}
}
