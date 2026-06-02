package Classes;
class Aluno{
    private String nome;
    private int cpf;
    private String email;
    private double senha;

    public Aluno(String nome, int cpf, String email, double senha){
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
    }
    public String nome(){
        return nome;
    }
    public int cpf(){
        if(cpf != 11){
             return cpf;
        }else{
            System.out.println("INSIRA O CPF CORRETAMENTE");
        }
        
        
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
