package aula08;

public class Aula08 {
    public static void main(String[] args) {
        Pessoa [] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Joao","M",21);
        p[1] = new Pessoa("Joana","F",22);

        l[0] = new Livro("a","x",19,p[0]);
        l[1] = new Livro("ax","xx",20,p[1]);
        l[2] = new Livro("xax","axx",21,p[0]);

        l[0].abrir();
        l[0].folhear(7);
        l[0].detalhes();
        l[1].detalhes();

    }
}
