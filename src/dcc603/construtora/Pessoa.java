package dcc603.construtora;

public class Pessoa {

	private String nome = "sem nome";
	private String telefone = "sem telefone";
	private String email = "sem email";
	
	public Pessoa(String nome, String telefone, String email) {
		this.setNome(nome);
		this.setTelefone(telefone);
		this.setEmail(email);
	}
	
	public String getNome() {
		return nome;
	}

	protected void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	protected void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	protected void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		return this.nome + ", " + this.telefone + ", " + this.email;
	}
	
}
