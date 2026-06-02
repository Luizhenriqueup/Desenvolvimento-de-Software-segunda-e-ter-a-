import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcao;

        do {

            System.out.println("\n=== ACADEMIA ===");
            System.out.println("1 - Cadastro");
            System.out.println("2 - Consulta");
            System.out.println("3 - Relatórios");
            System.out.println("4 - Sair");

            opcao = sc.nextInt();

            switch(opcao){

                case 1:
                    System.out.println(
                            "Cadastro");
                    break;

                case 2:
                    System.out.println(
                            "Consulta");
                    break;

                case 3:
                    System.out.println(
                            "Relatórios");
                    break;

                case 4:
                    System.out.println(
                            "Encerrando...");
                    break;

                default:
                    System.out.println(
                            "Opção inválida");
            }

        } while(opcao != 4);
    }
}
