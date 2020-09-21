package dcc603.construtora;

public class Main {

	public static void main(String[] args) {
		// Cria projeto
		Projeto projeto = new Projeto("Projeto X");
		
		// Cria engenheiro do projeto
		{
			Engenheiro engenheiro = new Engenheiro("Danilo Engenheiro", "(99) 99999-9999", "danilo@email.com", "99999999");

			// Atribui responsabilidade do projeto para o engenheiro
			engenheiro.atribuirResponsabilidadeDeProjeto(projeto);			
		}
		
		// Cria clientes do projeto
		{
			Cliente cliente1 = new Cliente("Danilo Cliente 1", "(99) 99999-9999", "danilo@email.com");
			Cliente cliente2 = new Cliente("Danilo Cliente 2", "(99) 99999-9999", "danilo@email.com");

			// Adiciona clientes ao projeto
			projeto.adicionarCliente(cliente1);
			projeto.adicionarCliente(cliente2);	
		}
		
		// Simula balanco do projeto
		{
			Gasto gasto = new Gasto(1000, "registro na prefeitura", "a nota fiscal");
			projeto.registrarGasto(gasto);
			
			Pagamento pagamento = new Pagamento(500, "primeira parcela", "o comprovante");
			projeto.registrarPagamento(pagamento);	
		}
		
		System.out.println(projeto);
	}

}
