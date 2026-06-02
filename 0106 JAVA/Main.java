import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{       
            BufferedWriter bw = new BufferedWriter( new FileWriter("pedidos.txt", true));
            System.out.println("Escreva o nome do cliente:");
            String cliente = sc.nextLine();
            bw.write("Cliente: " + cliente);
            bw.newLine();
            System.out.println("Escreva o nome do Produto:");
            String produto = sc.nextLine();
            bw.write("Produto: " + produto);
            bw.newLine();
            System.out.println("Escreva o valor:");
            double valor = sc.nextDouble();
            bw.write("Valor: " + valor);
            bw.newLine();

            bw.close();

            System.out.println("DADOS SALVOS");
            System.out.println("=====Leitura de arquivo======");

            BufferedReader br = new BufferedReader(new FileReader("pedidos.txt"));
            String linha;
            while ((linha = br.readLine())!= null){
                System.out.println(linha);
            }
            br.close();
        }catch(IOException e){
            System.out.println("Erro ao salvar");
        }
        sc.close();
    }
}