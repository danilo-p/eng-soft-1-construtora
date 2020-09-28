package dcc603.construtora.test;

import static org.junit.Assert.*;

import org.junit.Test;

import dcc603.construtora.Cliente;
import dcc603.construtora.Engenheiro;
import dcc603.construtora.Projeto;

public class ProjetoTest {
	
	@Test
	public void testCriarProjetoSemNomePassa(){
		Projeto projeto = new Projeto();
		
		String nome = projeto.getNome();
		
		assertEquals("O projeto deve ter o nome padrão \"sem nome\".", nome, "sem nome");
	}

	@Test
	public void testCriarProjetoComNomePassa(){
		Projeto projeto = new Projeto("foo");
		
		String nome = projeto.getNome();
		
		assertEquals("O projeto deve ter o nome \"foo\".", nome, "foo");
	}
	
	@Test
	public void testAtribuirEngenheiroResponsavelPassa(){
		Projeto projeto = new Projeto();

		assertNull("O projeto não deve ter engenheiro responsável inicialmente.", projeto.getEngenheiroResponsavel());

		Engenheiro engenheiro = new Engenheiro("Danilo Engenheiro", "(99) 99999-9999", "danilo@email.com", "99999999");
		projeto.setEngenheiroResponsavel(engenheiro);
		
		assertEquals("O projeto deve ter Danilo Engenheiro como engenheiro responsável.", projeto.getEngenheiroResponsavel(), engenheiro);
	}
	
	@Test
	public void testAdicionarClientePassa(){
		Projeto projeto = new Projeto();
		Cliente cliente = new Cliente("Danilo Cliente", "(99) 99999-9999", "danilo@email.com");
		
		assertFalse("O cliente não deve ter acesso inicialmente.", projeto.checarAcessoDeCliente(cliente));

		projeto.adicionarCliente(cliente);
		
		assertTrue("O cliente deve ter acesso após adicionado ao projeto.", projeto.checarAcessoDeCliente(cliente));
	}
	
}
