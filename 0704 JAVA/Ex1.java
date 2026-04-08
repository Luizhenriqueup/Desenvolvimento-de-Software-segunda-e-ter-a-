class Aluno {
    private String nome;
    private int Idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIDade(int Idade) {
        this.Idade = Idade;
    }
}

public class Ex1 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("luiz");
        aluno.setIDade(20);
        System.out.println("NOME: " + aluno.getNome());
        if (aluno.getIdade() >= 0) {
            System.out.println("IDADE: " + aluno.getIdade());
        } else {
            System.out.println("IDADE N PODE SER NEGATIVO");
        }
    }
}
