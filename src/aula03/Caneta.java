package aula03;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;

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

    protected void tampar() {
        if (this.tampada == false) {
            this.tampada = true;

        }
    }

    protected void destampar() {
        if (this.tampada == true) {
            this.tampada = false;

        }
    }
}
