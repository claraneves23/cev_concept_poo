package aula11;

public class Zoo {
    public static void main(String[] args) {
       Mamifero m = new Mamifero();
       Canguru  c = new Canguru();
       Cachorro k = new Cachorro();

       m.setPeso(5.70);
       m.setIdade(8);
       m.setMembros(4);
       m.locomover();
       m.alimentar();
       m.emitirSom();

       c.setPeso(55.30);
       c.setIdade(3);
       c.setMembros(4);
       c.locomover();
       c.alimentar();
       c.emitirSom();
       c.usarBolsa();

       k.setPeso(3.94);
       k.setIdade(5);
       k.setMembros(4);
       k.locomover();
       k.alimentar();
       k.emitirSom();
       k.abanarRabo();

    }
}
