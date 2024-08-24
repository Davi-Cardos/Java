package poo;

public class Aluno {
	public Aluno(String nome) {
		setNome(nome);
	}
	private String nome;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Tema getTemas() {
		return temas;
	}
	public void setTemas(Tema temas) {
		this.temas = temas;
	}
	public Tema temas;
	
}

	
