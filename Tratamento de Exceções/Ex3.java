
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        try {
        Scanner entrada = new Scanner(System.in);
        System.out.println("SITEMAS Q CONVERTE TEXTO PARA NUMERO");
        System.out.println("DIGITE UM TEXTO QUE SERA CONVERTIDO PARA NUMERO: ");
        String texto = entrada.nextLine();
            int numero = Integer.parseInt(texto);
            System.out.println("NUMERO CONVERTIDO: " + numero + 5);
        } catch (NumberFormatException e) {
            System.out.println("O TEXTO DIGITADO N E TEXTO: ");
        }
    }
}
