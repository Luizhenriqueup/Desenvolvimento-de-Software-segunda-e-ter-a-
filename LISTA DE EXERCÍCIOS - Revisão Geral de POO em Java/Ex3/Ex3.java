import java.util.ArrayList;
import java.util.Scanner;

abstract class Entregador {

    private String nome;
    protected double distanciaEntrega;

    public Entregador(String nome, double distanciaEntrega) {

        this.nome = nome;
        this.distanciaEntrega = distanciaEntrega;

    }

    abstract double calcularEntrega();

    public String getNome() {

        return nome;

    }

}

class Moto extends Entregador {

    public Moto(String nome, double distanciaEntrega) {

        super(nome, distanciaEntrega);

    }

    @Override
    double calcularEntrega() {

        return distanciaEntrega + 10;

    }

}

class Bicicleta extends Entregador {

    public Bicicleta(String nome, double distanciaEntrega) {

        super(nome, distanciaEntrega);

    }

    @Override
    double calcularEntrega() {

        return distanciaEntrega;

    }

}

class CarroEntrega extends Entregador {
    public CarroEntrega(String nome, double distanciaEntrega) {

        super(nome, distanciaEntrega);

    }
    @Override
    double calcularEntrega() {

        return distanciaEntrega + 25;

    }
}

public class Ex3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        ArrayList<Entregador> entregas = new ArrayList<>();

        boolean continuar = true;

        while (continuar) {

            System.out.println("\n===== ESCOLHA UMA OPÇÃO =====");
            System.out.println("1 - Moto");
            System.out.println("2 - Bicicleta");
            System.out.println("3 - Carro");
            System.out.println("0 - Sair");
            System.out.print("Digite uma opção: ");

            int opcao = entrada.nextInt();

            switch (opcao) {

                case 1:
                    entregas.add(new Moto("Moto", 20));
                    System.out.println("\nVocê escolheu Moto!");
                    break;
                case 2:
                    entregas.add(new Bicicleta("Bicicleta", 15));
                    System.out.println("\nVocê escolheu Bicicleta!");
                    break;
                case 3:
                    entregas.add(new CarroEntrega("Carro", 30));
                    System.out.println("\nVocê escolheu Carro!");
                    break;
                case 0:
                    continuar = false;
                    System.out.println("\nFinalizando sistema...");
                    break;
                default:
                    System.out.println("\nOpção inválida!");
            }
        }

        double total = 0;

        System.out.println("\n======= RESUMO DAS ENTREGAS =======");

        for (Entregador e : entregas) {

            System.out.println(e.getNome() + " - R$ " + e.calcularEntrega());

            total += e.calcularEntrega();

        }
        System.out.println("-----------------------------------");
        System.out.println("Valor total: R$ " + total);
    }
}