package aula07;

public class Lutador {
	private String nome, nacionalidade, categoria;
	private int idade, vitoria, derrota, empate;
	private double peso, altura;
	
	//Método Construtor
	public Lutador( String no, String na, int id, double al, double pe, int vi, int de, int em) {
		this.nome = no;
		this.nacionalidade = na;
		this.idade = id;
		this.altura = al;
		setPeso(pe);
		this.vitoria = vi;
		this.derrota = de;
		this.empate = em;
				
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNacionalidade() {
		return nacionalidade;
	}
	
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
	
	public String getCategoria() {
		return this.categoria;
	}
	
	private void setCategoria() {
		if (this.peso < 52.2) {
			this.categoria = "Inválido";
		}
		else if (this.peso <= 70.3) {
			this.categoria = "Leve";
		}
		else if (this.peso <=83.9) {
			this.categoria ="Médio";
		}
		else if (this.peso <= 120.2) 
		{
			this.categoria ="Pesado";
		}
		else {
			this.categoria = "Inválido";
		}
	}
	
	
	public double getPeso() {
		return this.peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
		this.setCategoria();
	}
	
	public double getAltura() {
		return this.altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public void setIdadee(int idade) {
		this.idade = idade;
	}
	
	public int getEmpate() {
		return this.empate;
	}
	
	public void setEmpate(int empate) {
		this.empate = empate;
	}
	
	public int getDerrota() {
		return this.derrota;
	}
	
	public void setDerrota(int derrota) {
		this.derrota = derrota;
	}
	
	public int getVitoria() {
		return this.vitoria;
	}
	
	public void setVitoria(int vitoria) {
		this.vitoria = vitoria;
	}
	
	public void apresentar() {
		System.out.println("---------------------------");
		System.out.print("\nLutador:\t" + getNome());
		System.out.print("\nOrigem:\t" + getNacionalidade());
		System.out.print("\t" + getIdade() + " anos");
		System.out.print("\nAltura:\t" + getAltura());
		System.out.print("\nPeso:\t" + getPeso());
		System.out.print("\nCategoria:\t" + getCategoria());
		System.out.print("\nVitórias:\t" + getVitoria());
		System.out.print("\nDerrotas:\t" + getDerrota());
		System.out.print("\nEmpates:\t" + getEmpate());
	}
	
	public void status() {
		System.out.println("\n");
		System.out.println(getNome());
		System.out.println("é o peso " + getCategoria());
		System.out.println(getVitoria() + " vitórias");
		System.out.println(getDerrota() + " derrotas");
		System.out.println(getEmpate() + " empates");
			
		
	}
	
	public void ganharLuta() {
		setVitoria(this.getVitoria() + 1);
	} 
	
    public void perderLuta() {
    	setDerrota(this.getDerrota() + 1);
	}
    
    public void empatarLuta() {
    	setEmpate(this.getEmpate() + 1);
    }
	
}
