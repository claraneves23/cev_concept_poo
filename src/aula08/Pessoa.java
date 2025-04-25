package aula08;

public class Pessoa {
    private String nome, sexo;
    private int idade;

    Pessoa(String nome, String sexo, int idade){
        this.idade = idade;
        this.sexo = sexo;
        this.nome = nome;
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

    public void fazerAniversario() {
        this.idade ++;
        System.out.println("\nParabéns!. Agora você tem" + this.getIdade() + "\t anos");

    }
}
