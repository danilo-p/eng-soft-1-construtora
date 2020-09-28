package dcc603.construtora.test;

import static org.junit.Assert.*;

import org.junit.Test;

import dcc603.construtora.Engenheiro;
import dcc603.construtora.Projeto;

public class EngenheiroTest {

	@Test
	public void testCriarEngenheiroComInfoPassa() {
		Engenheiro engenheiro = new Engenheiro("Danilo Engenheiro", "(99) 99999-9999", "danilo@email.com", "99999999");
		
		String nome = engenheiro.getNome();
		String telefone = engenheiro.getTelefone();
		String email = engenheiro.getEmail();
		String registroCrea = engenheiro.getRegistroCrea();
		
		assertEquals("O engenheiro deve ter o nome \"Danilo\".", nome, "Danilo Engenheiro");
		assertEquals("O engenheiro deve ter o telefone \"(99) 99999-9999\".", telefone, "(99) 99999-9999");
		assertEquals("O engenheiro deve ter o email \"danilo@email.com\".", email, "danilo@email.com");
		assertEquals("O engenheiro deve ter o registro CREA \"99999999\".", registroCrea, "99999999");
	}
	
	@Test
	public void testAtribuirResponsabilidadeDeProjetoPassa() {
		Projeto projeto = new Projeto();
		Engenheiro engenheiro = new Engenheiro("Danilo Engenheiro", "(99) 99999-9999", "danilo@email.com", "99999999");
		
		assertFalse("O engenheiro não deve ser responsável pelo projeto inicialmente", engenheiro.isResponsavelPorProjeto(projeto));
		
		engenheiro.atribuirResponsabilidadeDeProjeto(projeto);
		
		assertTrue("O engenheiro deve ser responsável pelo projeto depois de atribuir responsabilidade", engenheiro.isResponsavelPorProjeto(projeto));
	}
	
	@Test
	public void testRevogarResponsabilidadeDeProjetoPassa() {
		Projeto projeto = new Projeto();
		Engenheiro engenheiro = new Engenheiro("Danilo Engenheiro", "(99) 99999-9999", "danilo@email.com", "99999999");
		engenheiro.atribuirResponsabilidadeDeProjeto(projeto);
		
		assertTrue("O engenheiro deve ser responsável pelo projeto inicialmente", engenheiro.isResponsavelPorProjeto(projeto));
		
		engenheiro.revogarResponsabilidadeDeProjeto(projeto);
		
		assertFalse("O engenheiro não deve ser responsável pelo projeto depois de revogar responsabilidade", engenheiro.isResponsavelPorProjeto(projeto));	
	}

}
