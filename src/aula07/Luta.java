package aula07;

import java.util.Random;

public class Luta{
	
	private Lutador desafiado;
	private Lutador desafiante;
	private boolean aprovada;

	
	
	public void marcarLuta(Lutador l1, Lutador l2) {
		if(l1.getCategoria() == l2.getCategoria() && (l1 != l2)) {
			this.aprovada = true;
			this.desafiado = l1;
			this.desafiante = l2;
		}
		else {
			this.aprovada = false;
			this.desafiado = null;
			this.desafiante = null;
		}
	}
	
	public void lutar() {
		if(this.aprovada == true) {
			System.out.println("\n### DESAFIADO ###\n");
			this.desafiado.apresentar();
			System.out.println("\n### DESAFIANTE ###\n");
			this.desafiante.apresentar();
			
			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3);
			switch(vencedor) {
			  case 0: //Empate
				  System.out.println("\nEmpatou\n");
				  this.desafiado.empatarLuta();
				  this.desafiante.empatarLuta();
				  break;
			  case 1: //Desafiado vence
				  System.out.println("\nVencedor: \t" + this.desafiado.getNome());
				  this.desafiado.ganharLuta();
				  this.desafiante.perderLuta();
				  break;
			  case 2: //Desafiante vence
				  System.out.println("\nVencedor: \t" + this.desafiante.getNome());
				  this.desafiante.ganharLuta();
				  this.desafiado.perderLuta();
				  break;
			}

		}
		else {
			System.out.println("A luta não pode acontecer!");
		}
	}

	public Lutador getDesafiado() {
		return desafiado;
	}
	
	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}
	
	public Lutador getDesafiante() {
		return desafiante;
	}
	
	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}
	
	/* Regras da Luta
	 * Só pode ser marcada entre lutadores da mesma categoria.
	 * Desafiado e desafiante devem ser lutadores diferentes.
	 * Só pode acontecer se estiver aprovada.
	 * Só pode ter como resultado a vitória de um dos lutadores ou o empate.
	 * */
}

	