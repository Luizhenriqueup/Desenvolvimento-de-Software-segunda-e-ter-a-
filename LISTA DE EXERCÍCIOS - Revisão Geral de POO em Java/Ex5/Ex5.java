import java.util.ArrayList;
import java.util.Scanner;
class Cliente {
    private String nome;
    public Cliente(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
}
abstract class Veiculo {
    private String modelo;
    protected double valorDiaria;
    public Veiculo(String modelo, double valorDiaria) {
        this.modelo = modelo;
        if (valorDiaria >= 0) {

            this.valorDiaria = valorDiaria;

        } else {

            System.out.println("Valor inválido");

        }

    }

    abstract double calcularAluguel(int dias);

    public String getModelo() {

        return modelo;

    }

}
class Carro extends Veiculo {

    public Carro(String modelo, double valorDiaria) {

        super(modelo, valorDiaria);

    }

    @Override
    double calcularAluguel(int dias) {

        return (valorDiaria * dias) + 50;

    }

}

class Moto extends Veiculo {

    public Moto(String modelo, double valorDiaria) {

        super(modelo, valorDiaria);

    }

    @Override
    double calcularAluguel(int dias) {

        return valorDiaria * dias;

    }

}

class Caminhao extends Veiculo {

    public Caminhao(String modelo, double valorDiaria) {

        super(modelo, valorDiaria);

    }

    @Override
    double calcularAluguel(int dias) {

        return (valorDiaria * dias) + 150;

    }

}

class Contrato {

    private Cliente cliente;
    private Veiculo veiculo;
    private int dias;

    public Contrato(Cliente cliente, Veiculo veiculo, int dias) {

        this.cliente = cliente;
        this.veiculo = veiculo;
        this.dias = dias;

    }

    public void mostrarResumo() {

        double total = veiculo.calcularAluguel(dias);

        if (dias > 7) {

            total = total - 100;

        }

        System.out.println("\n===== CONTRATO =====");
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Veículo: " + veiculo.getModelo());
        System.out.println("Dias: " + dias);
        System.out.println("Total: R$ " + total);

    }

}

public class Ex5 {
    public static void main(String[] args) {

        Scanner Entrada = new Scanner(System.in);

        ArrayList<Veiculo> veiculos = new ArrayList<>();

        Veiculo v1 = new Carro("CIVIC", 600);
        Veiculo v2 = new Moto("XRE", 300);
        Veiculo v3 = new Caminhao("VOLVO", 1200);

        veiculos.add(v1);
        veiculos.add(v2);
        veiculos.add(v3);

        System.out.println("Digite nome do cliente:");
        String nome = Entrada.nextLine();

        Cliente cliente = new Cliente(nome);

        System.out.println("1-Carro");
        System.out.println("2-Moto");
        System.out.println("3-Caminhão");

        int opcao = Entrada.nextInt();

        System.out.println("Quantos dias?");
        int dias = Entrada.nextInt();

        Veiculo escolhido = null;

        switch (opcao) {
            case 1:
                escolhido = v1;
                break;
            case 2:
                escolhido = v2;
                break;
            case 3:
                escolhido = v3;
                break;
        }
        Contrato contrato = new Contrato(cliente, escolhido, dias);
        contrato.mostrarResumo();
    }
}