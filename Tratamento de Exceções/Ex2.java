import java.util.InputMismatchException;
import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        try {
        System.out.println("DIGITA  SUA IDADE:");
        int idade = entrada.nextInt();
        System.out.println("SUA IDADE E: " + idade);
        } catch (InputMismatchException  e){
            System.out.println("TU SO PODE DIGITAR NUMERO INTEIRO");
        }
    }
}
