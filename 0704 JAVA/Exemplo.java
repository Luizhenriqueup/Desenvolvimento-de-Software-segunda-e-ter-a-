class Pessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }

    public void setIDade(int idade) {
        this.idade = idade;
    }
    }

    public class Exemplo {
        public static void main(String[] args) {
            Pessoa p = new Pessoa();
            p.setNome("Maria");
            p.setIDade(-20);
            System.out.println("NOME: " + p.getNome());
            if (p.getIdade() >= 0) {
                System.out.println("IDADE: " + p.getIdade());
            } else {
                System.out.println("NUMERO NEGATIVO NA IDADE");
            }
        }
    }
