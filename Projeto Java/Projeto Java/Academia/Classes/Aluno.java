package Classes;
class Aluno{
    private String nome;
    private int cpf;
    private String email;
    private double senha;

    public Aluno(String nome, int cpf, String email, double senha){
        this.nome = nome;
        if(cpf != 11){
            this.cpf = cpf;
        }else{
            System.out.println("Insira o cpf valido");
        }
        this.email = email;
        this.senha = senha;
    }
    public String nome(){
        return nome;
    }
    public int cpf(){
        return cpf;
        
    }
    public String email(){
        return email;
    }
    public double senha(){
        return senha;
    }
}
public class Aluno {
    public static void main(String[] args) {
        
    }    
}
