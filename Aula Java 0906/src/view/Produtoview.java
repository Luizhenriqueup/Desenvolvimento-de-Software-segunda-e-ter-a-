package view;
import java.util.ArrayList;
import Model.Produto;
import controller.Produtocontroller;

public class Produtoview {

    public void listarProdutos(){
        Produto p1 = new Produto("Notebook", 2000);
        Produto p3 = new Produto("Celular", 3000);
        Produto p2 = new Produto("Televisao", 2500);
        }
        
        Produtocontroller produtos = new Produtocontroller();{
        produtos.adicionarProduto(p1);
        produtos.adicionarProduto(p2);
        produtos.adicionarProduto(p3);
        
        
        produtos.cadastrarProduto();
        produtos.lerProdutos();
    
}




