import java.util.Scanner;
import java.util.ArrayList;

class Cliente {
    private String nome;

    public String getnome() {
        return nome;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    public Cliente(String nome){
        this.nome = nome;
    }
}
 abstract class Produto {
    private String nome;
    private double preço;
    
    public abstract double calcularPrecoFinal();

    public Produto(String nome, double preço) {
        this.nome = nome;
        this.preço = preço;
    }

    public String getnome() {
        return nome;
    }

    public Double getpreço() {
        return preço;
    }

    public void aplicarDesconto(double percentual) {
        this.preço = this.preço - (this.preço * percentual / 100);
    }
}
 class ProdutoFisico extends Produto{
    private double frete;
    @Override
    public double calcularPrecoFinal(){
        return preço + frete;
    }
}
class Produtodigital extends Produto{
    @Override
    public double calcularPrecoFinal(preço){
        return preço;
    }
}

class Carrinho {
    private ArrayList<Produto> produtos;

    public Carrinho() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        if (produto.getpreço() > 0) {
            produtos.add(produto);
        } else {
            System.out.println("Por favor adicionar um produto");
        }
    }

    public void removerProduto(Produto produto) {
        produtos.remove(produto);
    }

    public double calcularTotal() {
        double total = 0;
        for (Produto p : produtos) {
            total += p.calcularPrecoFinal();
        }
        return total;
    }

    public void mostrarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("O seu Carrinho está vazio");
            return;
        } else {
            for (Produto p : produtos) {
                System.out.println(p.getnome() + " R$ " + p.getpreço());
            }
        }
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }
}

class Pedido {
    private Cliente cliente;
    private Carrinho carrinho;

    public Pedido(Cliente cliente, Carrinho carrinho) {
        this.cliente = cliente;
        this.carrinho = carrinho;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Carrinho getCarrinho() {
        return carrinho;
    }

    public void mostrarResumo() {
        System.out.println("=====RESUMO======");
        System.out.println("Cliente: " + cliente.getnome());
        System.out.println("Seus Produtos");
        carrinho.mostrarProdutos();
        System.out.println("Total: R$" + carrinho.calcularTotal());

    }
}

public class Ecommerce {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("DIGITE O SEU NOME");
        String nomeCliente = entrada.nextLine();
        Cliente cliente = new Cliente(nomeCliente);

        Produto p1 = new Produto("Celular", 2500);
        Produto p2 = new Produto("Televisao", 4300);
        Produto p3 = new Produto("Notebook", 3200);

        p1.aplicarDesconto(20);

        Carrinho carrinho = new Carrinho();

        boolean menu = true;

        while (menu) {
            System.out.println("\n===== MENU DE PRODUTOS =====");

            System.out.println("1 - Celular - R$ " + p1.getpreço());

            System.out.println("2 - Televisao - R$ " + p2.getpreço());

            System.out.println("3 - Notebook - R$ " + p3.getpreço());

            System.out.println("4 - Remover produto do carrinho");

            System.out.println("5 - Aplicar desconto em um produto");

            System.out.println("0 - Finalizar compra");

            System.out.print("Escolha uma opção: ");

            int opcao = entrada.nextInt();

            switch (opcao) {

                case 1:

                    carrinho.adicionarProduto(p1);

                    System.out.println("Você adicionou Celular ao carrinho");

                    break;

                case 2:

                    carrinho.adicionarProduto(p2);

                    System.out.println("Você adicionou Televisao ao carrinho");

                    break;

                case 3:

                    carrinho.adicionarProduto(p3);

                    System.out.println("Você adicionou Notebook ao carrinho");

                    break;

                case 4:

                    System.out.println("Produtos no carrinho: ");

                    carrinho.mostrarProdutos();

                    System.out.print("Digite o nome do produto a remover: ");

                    entrada.nextLine();

                    String nomeRemover = entrada.nextLine();

                    boolean removido = false;

                    for (Produto p : carrinho.getProdutos()) {

                        if (p.getnome().equalsIgnoreCase(nomeRemover)) {

                            carrinho.removerProduto(p);

                            System.out.println("Produto removido do carrinho");

                            removido = true;

                            break;

                        }

                    }

                    if (!removido) {

                        System.out.println("Produto não encontrado no carrinho.");

                    }

                    break;

                case 5:

                    System.out.println("Produtos disponíveis:");

                    System.out.println("1 - Celular - R$ " + p1.getpreço());

                    System.out.println("2 - Televisao - R$ " + p2.getpreço());

                    System.out.println("3 - Notebook - R$ " + p3.getpreço());

                    System.out.print("Digite o nome do produto para aplicar desconto: ");

                    entrada.nextLine();

                    String nomeDesconto = entrada.nextLine();

                    Produto produtoDesconto = null;

                    if (nomeDesconto.equalsIgnoreCase("Celular")) {

                        produtoDesconto = p1;

                    } else if (nomeDesconto.equalsIgnoreCase("Televisao")) {

                        produtoDesconto = p2;

                    } else if (nomeDesconto.equalsIgnoreCase("Notebook")) {

                        produtoDesconto = p3;

                    }

                    if (produtoDesconto != null) {

                        System.out.print("Digite o percentual de desconto: ");

                        double percentual = entrada.nextDouble();

                        produtoDesconto.aplicarDesconto(percentual);

                        System.out.println("Desconto aplicado! Novo preço: R$ " + produtoDesconto.getpreço());

                    } else {

                        System.out.println("Produto não encontrado.");

                    }

                    break;

                case 0:

                    menu = false;

                    System.out.println("Finalizando compra...");

                    break;

                default:

                    System.out.println("Opção inválida!");

            }

        }

        entrada.nextLine();

        Pedido pedido = new Pedido(cliente, carrinho);

        pedido.mostrarResumo();

        entrada.close();
    }
}
