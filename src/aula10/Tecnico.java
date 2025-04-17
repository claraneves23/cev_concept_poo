package aula10;

public class Tecnico extends Aluno {
	
	public void registroProfissional() {
		 System.out.println(this.getNome()+ " possui conhecimento técnico de " + this.getCurso() + " e atua na área\n");
	}
	
	public void praticar() {
		 System.out.println(this.getNome() + " está fazendo projetos para praticar\n");
	}
}
