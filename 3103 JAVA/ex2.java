class Aluno{
    String nome;
    int idade;


public Aluno(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
}
}


public class ex2 {
    public static void main(String[] args) {
        Aluno a = new Aluno("luiz", 20);
        System.out.println("nome: " + a.nome  + ", idade: " + a.idade);
    }
}
