package dcc603.construtora.test;

import static org.junit.Assert.*;

import org.junit.Test;

import dcc603.construtora.MovimentacaoFinanceira;

public class MovimentacaoFinanceiraTest {

	@Test
	public void testCriarMovimentacaoFinanceiraComInfoPassa() {
		MovimentacaoFinanceira movimentacaoFinanceira = new MovimentacaoFinanceira(10, "a descricao");
		
		int valor = movimentacaoFinanceira.getValor();
		String descricao = movimentacaoFinanceira.getDescricao();
		
		assertEquals("A movimentação financeira deve ter o valor 10.", valor, 10);
		assertEquals("A movimentação financeira deve ter a descrição \"a descricao\".", descricao, "a descricao");
	}

}
