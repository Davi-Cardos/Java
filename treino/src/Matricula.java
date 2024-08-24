
public class Matricula {
	private int numero_matricula;
	private String nome_estudante;
	private double media;

public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

public int getnumero_matricula(){
	return numero_matricula;
}

public void setnumero_matricula(int numero) {
	this.numero_matricula = numero;
}

public String getnome_estudante() {
	return nome_estudante;
}

public void setnome_estudante(String nome) {
	this.nome_estudante = nome;
}
}