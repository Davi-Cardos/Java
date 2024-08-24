package poo;

import java.util.ArrayList;

public class Turma {

	public Aluno[] alunos = new Aluno[8];
	ArrayList<Tema>temasDisponiveis = new ArrayList<Tema>();
	
	public Turma(Aluno[] alunos) {

		this.alunos = alunos;
		for(Tema tema: temasDisponiveis) {
			temasDisponiveis.add(tema);
			temasDisponiveis.add(tema);
		}
	}
	public Aluno[] getAlunos() {
		return alunos;
	}
	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}
	public ArrayList<Tema> getTemasDisponiveis() {
		return temasDisponiveis;
	}
	public void setTemasDisponiveis(ArrayList<Tema> temasDisponiveis) {
		this.temasDisponiveis = temasDisponiveis;
	}
	
	public void SolicitarTema(Tema tema, Aluno a) throws MinhaExcessao{
			int x = 0;
		for(Tema tem: temasDisponiveis) {
			if(tem == tema) {
				a.setTemas(tema);
				temasDisponiveis.remove(tem);
			}
			else {
			throw new MinhaExcessao("Tema não disponivel fera");
		}
	}
	}
}
