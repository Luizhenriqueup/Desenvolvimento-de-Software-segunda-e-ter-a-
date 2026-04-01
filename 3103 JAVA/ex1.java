class Pessoa {
    String nome;
    int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}

public class ex1 {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("maria", 25);
        System.out.println("nome: " + p.nome + " Idade: " + p.idade);
    }
}
