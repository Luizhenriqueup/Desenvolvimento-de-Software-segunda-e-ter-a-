import java.util.ArrayList;
class Produto{
    private String nome;
    private double preco;

    final double IMPOSTO = 0.10;

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public double calcularPrecofinal(){
        return preco + (preco * IMPOSTO);
    }

    public void Mostrarproduto(){
        System.out.println(nome + " R% " + calcularPrecofinal());
    }
}

String Mostrarproduto;
public class Ex3 {
    public static void main(String[] args) {
        ArrayList<Produto> lista = new ArrayList<>();
        lista.add(new Produto("notebook", 3000));
        lista.add(new Produto("mouse", 100));
        
        for(Produto p: lista){
            p.Mostrarproduto();
        }
    }
}
