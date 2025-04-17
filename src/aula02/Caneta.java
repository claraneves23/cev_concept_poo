package aula02;

public class Caneta {
		String modelo;
		String cor;
		float ponta;
		int carga;
		boolean tampada;
	
	  public void status() {
		  System.out.println("Modelo:\t" + this.modelo);
		  System.out.println("Uma caneta\t" + this.cor);
		  System.out.println("Ponta:\t" + this.ponta);
		  System.out.println("Carga:\t" + this.carga);
		  System.out.println("está tampada?\t" + this.tampada);
	  }
	  
	  public void rabiscar() {
		  if (this.tampada == true)
			  System.out.println("ERRO, não consigo rabiscar");
		  else
			  System.out.println("Rabisco");
	  }
	  
	  public void tampar() {
		  if (this.tampada == false) {
			 this.tampada = true;
			  
		  }
	  }
	  
	  public void destampar() {
		  if (this.tampada == true) {
				 this.tampada = false;
				  
			  }
	  }

}
