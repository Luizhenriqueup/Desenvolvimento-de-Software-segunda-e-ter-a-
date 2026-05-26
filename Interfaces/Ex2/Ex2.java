import java.util.Scanner;
interface Registravel{
    void registrarEntrada();
}

class Gerente implements Registravel{

    @Override
    public void registrarEntrada(){
        System.out.println("Gerente registrou entrada");
    }
}

class Desenvolvedor implements Registravel{

    @Override
    public void registrarEntrada(){
        System.out.println("Desenvolvedor registrou entrada");
    }
}

class Estagiario implements Registravel{

    @Override
    public void registrarEntrada(){
        System.out.println("Estagiário registrou entrada");
    }
}

public class Ex2{
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int total = 0;
        boolean continuar = true;

        while(continuar){

            System.out.println("\n===== REGISTRAR ENTRADA =====");
            System.out.println("1-Gerente");
            System.out.println("2-Desenvolvedor");
            System.out.println("3-Estagiário");
            System.out.println("0-Sair");

            int opcao = entrada.nextInt();

            switch(opcao){

                case 1:
                    Registravel g = new Gerente();
                    g.registrarEntrada();
                    total++;
                    break;
                case 2:
                    Registravel d = new Desenvolvedor();
                    d.registrarEntrada();
                    total++;
                    break;
                case 3:
                    Registravel e = new Estagiario();
                    e.registrarEntrada();
                    total++;
                    break;
                case 0:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
        System.out.println("\nTotal de registros: " + total);
    }
}