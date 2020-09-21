package dcc603.construtora;

public class Gasto extends MovimentacaoFinanceira {
	
	private String notaFiscal = "sem nota fiscal";
	
	public Gasto(int valor, String descricao, String notaFiscal) {
		super(valor, descricao);
		
		this.notaFiscal = notaFiscal;
	}
	
	public String getNotaFiscal() {
		return notaFiscal;
	}
	
	public String toString() {
		return super.toString() + ", " + this.notaFiscal;
	}

}
