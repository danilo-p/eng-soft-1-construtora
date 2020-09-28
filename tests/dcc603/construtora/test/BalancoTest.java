package dcc603.construtora.test;

import static org.junit.Assert.*;

import org.junit.Test;

import dcc603.construtora.Balanco;
import dcc603.construtora.Gasto;
import dcc603.construtora.Pagamento;

public class BalancoTest {

	@Test
	public void testRegistrarGastoPassa(){
		Balanco balanco = new Balanco();
		
		assertEquals("O saldo final do balanco deve ser 0 inicialmente.", balanco.calcularSaldoFinal(), 0);
		
		Gasto gasto = new Gasto(1000, "registro na prefeitura", "a nota fiscal");
		balanco.registrarGasto(gasto);
		
		assertEquals("O saldo final do balanco deve ser -1000 depois de registrar o gasto.", balanco.calcularSaldoFinal(), -1000);
	}
	
	@Test
	public void testRegistrarPagamentoPassa(){
		Balanco balanco = new Balanco();
		
		assertEquals("O saldo final do balanco deve ser 0 inicialmente.", balanco.calcularSaldoFinal(), 0);
		
		Pagamento pagamento = new Pagamento(500, "primeira parcela", "o comprovante");
		balanco.registrarPagamento(pagamento);
		
		assertEquals("O saldo final do balanco deve ser 500 depois de registrar o gasto.", balanco.calcularSaldoFinal(), 500);
	}

}
