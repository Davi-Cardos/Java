
public abstract class Pessoa {
	
	private String nome;
	private int idade;
	private char sexo;
	
	
	public String getNome() {
		return nome;
	}
	public int getIdade() {
		return idade;
	}
	public char getSexo() {
		return sexo;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public final void fazeraniversario() {
		this.setIdade(this.getIdade() + 1);
		System.out.println("PARABÉNS STRAAAANGEEER PELOS SEUS " +this.getIdade());
	}
	
	
	
	
	
	
	
	
}
