package dcc603.construtora.test;

import static org.junit.Assert.*;

import org.junit.Test;

import dcc603.construtora.Pessoa;

public class PessoaTest {

	@Test
	public void testCriarPessoaComInfoPassa() {
		Pessoa pessoa = new Pessoa("Danilo", "(99) 99999-9999", "danilo@email.com");
		
		String nome = pessoa.getNome();
		String telefone = pessoa.getTelefone();
		String email = pessoa.getEmail();
		
		assertEquals("A pessoa deve ter o nome \"Danilo\".", nome, "Danilo");
		assertEquals("A pessoa deve ter o telefone \"(99) 99999-9999\".", telefone, "(99) 99999-9999");
		assertEquals("A pessoa deve ter o email \"danilo@email.com\".", email, "danilo@email.com");
	}

}
