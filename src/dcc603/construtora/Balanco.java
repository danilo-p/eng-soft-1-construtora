package dcc603.construtora;

import java.util.ArrayList;

public class Balanco {

	private ArrayList<Gasto> gastos = new ArrayList<Gasto>();
	private ArrayList<Pagamento> pagamentos = new ArrayList<Pagamento>();
	
	public void registrarGasto(Gasto gasto) {
		this.gastos.add(gasto);
	}
	
	public void registrarPagamento(Pagamento pagamento) {
		this.pagamentos.add(pagamento);
	}
	
	public int calcularSaldoFinal() {
		int saldoFinal = 0;

		// Subtrai todos os gastos do saldo final
		for (Gasto gasto : this.gastos) {
			saldoFinal -= gasto.getValor();
		}
		
		// Adiciona todos os pagamentos ao saldo final
		for (Pagamento pagamento : this.pagamentos) {
			saldoFinal += pagamento.getValor();
		}
		
		return saldoFinal;
	}
	
	public String toString() {
		return "" + this.calcularSaldoFinal();
	}
	
}
