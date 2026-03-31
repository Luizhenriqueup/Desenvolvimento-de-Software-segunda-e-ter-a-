class Pessoa{
    String nome;
    int idade;
}
class Funcionario extends Pessoa{
    String salario;

}


public class ex1 {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();

        funcionario1.nome = "LULA";
        funcionario1.idade = 78;
        funcionario1.salario = "mensalão";


        System.out.println("Nome: " + funcionario1.nome);
        System.out.println("IDADE: " + funcionario1.idade);
        System.out.println("Salario: " + funcionario1.salario);

    }
}
