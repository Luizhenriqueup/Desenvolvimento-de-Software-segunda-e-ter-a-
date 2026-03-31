class Animal{
   String nome;
}

class Cachorro extends Animal{
    String raça;
}


public class ex2 {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro();
        cachorro1.nome = "PITU";
        cachorro1.raça = "AWP";

        System.out.println("NOME: " + cachorro1.nome);
        System.out.println("RAÇA: " + cachorro1.raça);


    }
}
