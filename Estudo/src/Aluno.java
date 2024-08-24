
public class Aluno extends Pessoa{
	
	private int mat;
	private String curso;
	
	
	public void CancelarMatricula() {
		System.out.println("Cancelando a matricula do curso " +this.getCurso());
		this.setCurso(null);
	}
	
	public  void PagarMensalidade() {
		if(this.getCurso() != null) {
		System.out.println("Pagando matricula do curso " +this.getCurso());
		}
		else {
			System.out.println("Não está em um curso STRANGEEER");
		}
	}
	
	public int getMat() {
		return mat;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	
}
