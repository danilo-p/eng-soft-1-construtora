package dcc603.construtora;

import java.util.ArrayList;

public class Projeto {

	private String nome = "sem nome";
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	private Engenheiro engenheiroResponsavel = null;
	private Balanco balanco = new Balanco();
	
	public Projeto(String nome) {
		this.setNome(nome);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Engenheiro getEngenheiroResponsavel() {
		return engenheiroResponsavel;
	}

	public void setEngenheiroResponsavel(Engenheiro engenheiroResponsavel) {
		this.engenheiroResponsavel = engenheiroResponsavel;
	}
	
	public void adicionarCliente(Cliente cliente) {
		this.clientes.add(cliente);
	}
	
	public void registrarGasto(Gasto gasto) {
		this.balanco.registrarGasto(gasto);
	}
	
	public void registrarPagamento(Pagamento pagamento) {
		this.balanco.registrarPagamento(pagamento);
	}
	
	public String toString() {
		String resultado = this.nome + ", " + this.engenheiroResponsavel;
		
		// Imprime todos os clientes do projeto
		for (Cliente cliente : this.clientes) {
			resultado += ", " + cliente;
		}
		
		resultado += ", " + this.balanco;
		
		return resultado;
	}
	
}
