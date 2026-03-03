package com.algaworks;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContatoTest {

	@Test
	void testIsNovo() {
		Contato contatoNovo = new Contato();
		assertTrue(contatoNovo.isNovo(), "Contato sem ID deveria ser novo");
		
		Contato contatoExistente = new Contato("1", "João", "+55 11 9999-9999");
		assertFalse(contatoExistente.isNovo(), "Contato com ID não deveria ser novo");
	}

}
