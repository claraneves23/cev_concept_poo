package aula09;

public class Aula09 {
    public static void main (String Args []) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("JOSIAS");
        p2.setNome("JOLIANA");
        p3.setNome("JOSÉ");
        p4.setNome("JESSÉ");

        p2.setCurso("Informática");
        p3.setSalario(10000);
        p4.setSetor("Estoque");

        p1.Exibir();
        p2.Exibir();
        p3.Exibir();
        p4.Exibir();

        System.out.println(p2.getCurso());
        System.out.println(p3.getSalario());
        System.out.println(p4.getSetor());
    }
}
