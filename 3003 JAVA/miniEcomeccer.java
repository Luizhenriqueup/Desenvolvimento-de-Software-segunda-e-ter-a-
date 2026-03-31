import java.util.ArrayList;

class Produto{
String nome;
double preço;
}
class Carrinho{
   ArrayList<Produto> produtos=new ArrayList<>();
    void adicionarProduto(Produto produto){
        produtos.add(produto);
    }

    void listarProdutos(){
        System.out.println("");

        for(Produto p: produtos){
        System.out.println(p.nome + " - R$ " + p.preço);
        }
    }


void calcularTotal(){
    double total = 0;
    for(Produto p : produtos){
        total += p.preço;
    }

    System.out.println("total de compra? R$" +total);
}
 }


public class miniEcomeccer {
    public static void main(String[] args) {
        Produto p1= new Produto();
        p1.nome = "macarrão";
        p1.preço = 2.50;

        Produto p2= new Produto();
        p2.nome = "peixe";
        p2.preço = 14.50;

        Produto p3= new Produto();
        p3.nome = "tomate";
        p3.preço = 10.20;

        Carrinho carrinho = new Carrinho();

        carrinho.adicionarProduto(p1);
        carrinho.adicionarProduto(p2);
        carrinho.adicionarProduto(p3);

        carrinho.listarProdutos();
        carrinho.calcularTotal();
    }
}