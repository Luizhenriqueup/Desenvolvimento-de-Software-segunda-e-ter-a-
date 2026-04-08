/*import java.util.ArrayList;

class Produto {
    String nome;
    double preço;
}

class ProdutoFisico extends Produto {
    double peso;
}

class ProdutoDigital extends Produto {
    double tamanhoArquivo;
}

class Carrinho {
    ArrayList<Produto> produtos = new ArrayList<>();

    void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    void listarProdutos() {
        System.out.println("Produtos no carrinho");
        for (Produto p : produtos) {
            System.out.println("PRODUTO NORMAL");
            System.out.println("Nome: " + p.nome);
            System.out.println("Preço: " + p.preço);

            // verificando o tipo de produto
            if (p instanceof ProdutoFisico) {
                ProdutoFisico pf = (ProdutoFisico) p;
                System.out.println("PRODUTO FISICO:");
                System.out.println("Peso: " + pf.peso + "kg");
            }
            if (p instanceof ProdutoDigital) {
                ProdutoDigital pd = (ProdutoDigital) p;
                System.out.println("PRODUTO DIGITAL:");
                System.out.println("tamanho: " + pd.tamanhoArquivo + "MB");
            }

        }

    }

    void calcularTotal() {
        double total = 0;
        for (Produto p : produtos) {
            total += p.preço;
        }
        System.out.println("o total dos preços comprados são: " + total);
    }

}

public class miniEcomecerComErenca {
    public static void main(String[] args) {
        ProdutoFisico p1Fisico = new ProdutoFisico();
        p1Fisico.nome = "Notebook";
        p1Fisico.preço = 2.500;
        p1Fisico.peso = 2;

        ProdutoFisico p2Fisico = new ProdutoFisico();
        p2Fisico.nome = "Celular";
        p2Fisico.preço = 5.200;
        p2Fisico.peso = 1;

        ProdutoFisico p3Fisico = new ProdutoFisico();
        p3Fisico.nome = "Monitor";
        p3Fisico.preço = 3.200;
        p3Fisico.peso = 2;

        ProdutoDigital p1Digital = new ProdutoDigital();
        p1Digital.nome = "Cash";
        p1Digital.preço = 20.00;
        p1Digital.tamanhoArquivo = 300;

        ProdutoDigital p2Digital = new ProdutoDigital();
        p2Digital.nome = "Memoria";
        p2Digital.preço = 100.00;
        p2Digital.tamanhoArquivo = 100;

        ProdutoDigital p3Digital = new ProdutoDigital();
        p3Digital.nome = "Seguidores";
        p3Digital.preço = 35.00;
        p3Digital.tamanhoArquivo = 33;

        Carrinho carrinho = new Carrinho();
        carrinho.adicionarProduto(p1Fisico);
        carrinho.adicionarProduto(p2Fisico);
        carrinho.adicionarProduto(p3Fisico);
        carrinho.adicionarProduto(p1Digital);
        carrinho.adicionarProduto(p2Digital);
        carrinho.adicionarProduto(p3Digital);

        carrinho.listarProdutos();
        carrinho.calcularTotal();
    }
}*/
