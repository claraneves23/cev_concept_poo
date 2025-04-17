package aula10;

public abstract class Pessoa {
	private String nome, sexo;
	int idade;
	
	public void Exibir() {
		System.out.println("\n------------DADOS----------\n");
		System.out.println("Nome: \t" + this.getNome());
		System.out.println("Sexo: \t" + this.getSexo());
		System.out.println("Idade: \t" + this.getIdade());
		System.out.println("\n----------------------------\n");
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSexo() {
		return this.sexo;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public final void fazerAniversario() {
		this.idade ++;
		System.out.println("\nParabéns!. Agora você tem" + this.getIdade() + "\t anos");
		
	}
}
