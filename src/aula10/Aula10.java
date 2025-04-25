package aula10;

public class Aula10 {
    public static void main (String args []) {

        Visitante v1 = new Visitante();
        v1.setNome("Ana");
        v1.setIdade(23);
        v1.setSexo("F");
        v1.Exibir();

        Aluno a1 = new Aluno();
        a1.setNome("Joao");
        a1.setIdade(29);
        a1.setSexo("M");
        a1.setCurso("Java");
        a1.Exibir();
        System.out.println("\n" + a1.getCurso());
        a1.pagarMensalidade();


        Bolsista b1 = new Bolsista();
        b1.setNome("Maria");
        b1.setBolsa(100);
        b1.setSexo("F");
        b1.Exibir();
        b1.pagarMensalidade();

        Tecnico t1 = new Tecnico();
        t1.setNome("Lia");
        t1.setIdade(100);
        t1.setSexo("F");
        t1.setCurso("ADS");
        t1.Exibir();
        t1.registroProfissional();
        t1.praticar();


    }
}
