import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        try {
        System.out.println("DIGITA UM NUMERO:");
        double n1 = entrada.nextDouble();
        System.out.println("DIGITA OUTRO NUMERO");
        double n2 = entrada.nextDouble();

        double result = n1/n2;

        System.out.println("o valor da sua divisão foi: " + result);
        } catch (ArithmeticException e){
            System.out.println("Não pode dividir com 0");
        }

    }
}
