package dcc603.construtora.test;

import static org.junit.Assert.*;

import org.junit.Test;

import dcc603.construtora.Pagamento;

public class PagamentoTest {

	@Test
	public void testCriarPagamentoComInfoPassa() {
		Pagamento pagamento = new Pagamento(10, "a descricao", "o comprovante");
		
		int valor = pagamento.getValor();
		String descricao = pagamento.getDescricao();
		String comprovante = pagamento.getComprovante();
		
		assertEquals("O pagamento deve ter o valor 10.", valor, 10);
		assertEquals("O pagamento deve ter a descrição \"a descricao\".", descricao, "a descricao");
		assertEquals("O pagamento deve ter o comprovante \"o comprovante\".", comprovante, "o comprovante");
	}

}
