package dcc603.construtora;

import java.util.ArrayList;

public class Engenheiro extends Pessoa {

	private String registroCrea = "sem registro";
	private ArrayList<Projeto> projetos = new ArrayList<Projeto>();
	
	public Engenheiro(String nome, String telefone, String email, String registroCrea) {
		super(nome, telefone, email);

		this.setRegistroCrea(registroCrea);
	}

	public String getRegistroCrea() {
		return registroCrea;
	}

	private void setRegistroCrea(String registroCrea) {
		this.registroCrea = registroCrea;
	}
	
	public boolean isResponsavelPorProjeto(Projeto projeto) {
		return this.projetos.contains(projeto);
	}
	
	public boolean atribuirResponsabilidadeDeProjeto(Projeto projeto) {
		// Nao se pode atribuir a responsabilidade se o engenheiro ja e responsavel pelo projeto
		if (this.isResponsavelPorProjeto(projeto)) {
			return false;
		}
		
		this.projetos.add(projeto);
		projeto.setEngenheiroResponsavel(this);
		
		return true;
	}
	
	public boolean revogarResponsabilidadeDeProjeto(Projeto projeto) {
		// Nao se pode remover a responsabilidade se o engenheiro nao e responsavel pelo projeto
		if (!this.isResponsavelPorProjeto(projeto)) {
			return false;
		}

		this.projetos.remove(projeto);
		projeto.setEngenheiroResponsavel(null);
		
		return true;
	}

	public String toString() {
		return super.toString() + ", " + this.registroCrea;
	}
	
}
