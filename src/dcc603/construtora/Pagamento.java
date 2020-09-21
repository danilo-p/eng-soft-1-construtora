package dcc603.construtora;

public class Pagamento extends MovimentacaoFinanceira {
	
	private String comprovante = "sem comprovante";
	
	public Pagamento(int valor, String descricao, String comprovante) {
		super(valor, descricao);

		this.comprovante = comprovante;
	}

	public String getComprovante() {
		return comprovante;
	}
	
	public String toString() {
		return super.toString() + ", " + this.comprovante;
	}

}
