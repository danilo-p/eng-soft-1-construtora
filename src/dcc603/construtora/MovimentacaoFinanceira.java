package dcc603.construtora;

public class MovimentacaoFinanceira {

	private int valor = 0;
	private String descricao = "sem descricao";

	public MovimentacaoFinanceira(int valor, String descricao) {
		this.valor = valor;
		this.descricao = descricao;
	}

	public int getValor() {
		return valor;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public String toString() {
		return this.valor + ", " + this.descricao;
	}
	
}
