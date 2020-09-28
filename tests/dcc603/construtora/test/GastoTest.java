package dcc603.construtora.test;

import static org.junit.Assert.*;

import org.junit.Test;

import dcc603.construtora.Gasto;

public class GastoTest {

	@Test
	public void testCriarGastoComInfoPassa() {
		Gasto gasto = new Gasto(10, "a descricao", "a nota fiscal");
		
		int valor = gasto.getValor();
		String descricao = gasto.getDescricao();
		String notaFiscal = gasto.getNotaFiscal();
		
		assertEquals("O gasto deve ter o valor 10.", valor, 10);
		assertEquals("O gasto deve ter a descrição \"a descricao\".", descricao, "a descricao");
		assertEquals("O gasto deve ter a nota fiscal \"a nota fiscal\".", notaFiscal, "a nota fiscal");
	}

}
