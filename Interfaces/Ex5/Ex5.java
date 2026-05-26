import java.util.ArrayList;
import java.util.Scanner;
interface PagamentoGame{
    double processarPagamento(double valor);
}

class PixGame implements PagamentoGame{

    @Override
    public double processarPagamento(double valor){
        return valor;
    }
}

class CartaoGame implements PagamentoGame{

    @Override
    public double processarPagamento(double valor){
        return valor + 10;
    }
}

class PaypalGame implements PagamentoGame{

    @Override
    public double processarPagamento(double valor){
        return valor + 20;
    }
}

class Compra{
    private String jogador;
    private double valor;
    private String pagamento;

    public Compra(String jogador,double valor,String pagamento){
        this.jogador = jogador;
        this.valor = valor;
        this.pagamento = pagamento;
    }

    public void mostrarResumo(){
        System.out.println("\n===== RESUMO =====");
        System.out.println("Jogador: " + jogador);
        System.out.println("Pagamento: " + pagamento);
        System.out.println("Valor: R$ " + valor);

    }
}

public class Ex5{
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        ArrayList<PagamentoGame> pagamentos = new ArrayList<>();

        System.out.println("Digite nome do jogador:");
        String nome = entrada.nextLine();

        System.out.println("Digite valor da compra:");
        double valor = entrada.nextDouble();

        System.out.println("\n1-Pix");
        System.out.println("2-Cartão");
        System.out.println("3-Paypal");

        int opcao = entrada.nextInt();

        PagamentoGame pagamento = null;
        String tipo = "";

        switch(opcao){

            case 1:
                pagamento = new PixGame();
                tipo = "Pix";
                break;
            case 2:
                pagamento = new CartaoGame();
                tipo = "Cartão";
                break;
            case 3:
                pagamento = new PaypalGame();
                tipo = "Paypal";
                break;

        }

        pagamentos.add(pagamento);
        double total = pagamento.processarPagamento(valor);
        Compra compra = new Compra(nome,total,tipo);

        compra.mostrarResumo();
    }
}