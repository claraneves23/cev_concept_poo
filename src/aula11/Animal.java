package aula11;

public abstract class Animal {
    protected double peso;
    protected double idade;
    protected double membros;
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();

    public double getIdade() {
        return idade;
    }

    public void setIdade(double idade) {
        this.idade = idade;
    }

    public double getMembros() {
        return membros;
    }

    public void setMembros(double membros) {
        this.membros = membros;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }


}
