
public class Cachorro {
	public String Nome;
	public int quantidade;
	public String raca;
	
	public Cachorro(String nome, int qtd, String raca) {
		this.raca = raca;
		this.quantidade = qtd;
		this.Nome = nome;
	}
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		this.Nome = nome;
	}
	public int getquantidade() {
		return quantidade;
	}
	public void setquantidade(int qtd) {
		this.quantidade = qtd;
	}
	public String getraca() {
		return raca;
	}
	public void setraca(String r) {
		this.raca = r;
	}
	
	
}
	
	