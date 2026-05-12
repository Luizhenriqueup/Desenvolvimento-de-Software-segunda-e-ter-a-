import java.util.ArrayList;
public class Ex1 {
    public static void main(String[] args){
        final double MEDIA_MINIMA = 7.0;
        ArrayList<Double> notas = new ArrayList<>(); 
        notas.add(10.0);
        notas.add(6.00);
        notas.add(6.00);
        notas.add(6.00);

        double soma = 0;
        for(double n: notas){
            soma += n;
        }

        double media = soma/notas.size();

        System.out.println("MEDIA: "  + media);

        if(media >= MEDIA_MINIMA){
            System.out.println("APROVADO");
        }else{
            System.out.println("REPROVADO");
        }
    }
}
