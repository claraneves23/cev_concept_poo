package aula10;

import aula09.Pessoa;

public class Professor extends Pessoa {
    private String especialidade;
    private double salario;

    public void receberAumento(double p) {
        this.salario += p;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getEspecialidade() {
        return this.especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
