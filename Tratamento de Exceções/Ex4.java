import java.util.ArrayList;
public class Ex4 {
    public static void main(String[] args) {
         ArrayList <String> nomes = new ArrayList<>(); 
         nomes.add("Luiz");
         nomes.add("Maria");
         nomes.add("Silva");
         try {
         System.out.println(nomes.get(0));
         } catch (IndexOutOfBoundsException e) {
            System.out.println("POSIÇÃO ERRADA");
        }
    }
}
