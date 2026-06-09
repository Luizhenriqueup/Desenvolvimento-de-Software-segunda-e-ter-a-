import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import model.Produto;

public class Produtocontroller{
    private ArrayList<Produto> produtos = new Arraylist();

    public void adicionarProduto(Produto produto){
        produto.add(produto);
    }

    public ArrayList<Produto> getProdutos(){
        return produtos;
    }

    public void cadastrarProduto(){
        try{
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("produtos.dat"));
            oss.writeObject(produtos);
            oss.close();
            }catch(Exception e ){
                System.out.println("erro");
            }
    }
    public void lerProdutos(){
        try{
        ObjectOutputStream ois = new ObjectOutputStream(new FileOutputStream("produtos.dat"));
        ArrayList<Produto> Lista - (ArrayList<Produto>) ois. readObject();
        }catch(Exception e){
            System.out.println("ERRO");
        }
    }
}