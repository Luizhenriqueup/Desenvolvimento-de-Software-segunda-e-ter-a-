/* ----------------------------------------------------------------AULA 02-----------------------------------------------------------------------------------------------------------


============================== 1 Nesse codigo usando um laço de repetição for para contar de 1 até 10 ==============================

public class Main {

    public static void main(String[] args) {
     for (int i = 0; i <=10; i++){
        System.out.println("o valor e:" + i++);
     }

        
    }
}

============================== 2 E um codigo usando o laço de repetição for para imprimir numero pares ==============================
 public class Main {
 
    public static void main(String[] args){
        for (int i=0; i<=20; i+=2){
        System.out.println(i);
    }
    }
 }

 ============================== 3 Esse codigo é para imprimir a tabuada do 5 usando o laço de repetição for ==============================
 public class Main {
 
    public static void main(String[] args){
        int b = 1;
        for (int i = 5; i<=50; i+=5){
                System.out.println("Tabuada do 5 x " + b + ": " + i);
                b++;
            }
            
        }
    }

============================== 4 Esse codigo foi um rascunho para usar o while para imprimir de 1 até 5 ==============================
    public class Main {
    
        public static void main(String[] args){
            int i=1;

            while (i <=5) {
                System.out.println(i);
                i++;
            }
        }
    }

============================== 5 Esse codigo também utiliza o laço de repetição While só que pedindo para o usuario inserir os numeros, quando ele digitar 0 para ==============================
    import java.util.Scanner;

    public class ExemploWhile{
        public static void main(String[] args){
            Scanner entrada = new Scanner(System.in);

            int numero = 1;

            while(numero !=0){
                System.out.print("digite um numero (0 para sair):");
                numero = entrada.nextInt();
            }

            System.out.println("programa finalizado");
        }
    }

============================== 6 Esse codigo utiliza o metodo while para imprimir de 1 até 10 com o icremento no i ==============================
   public class Main {
    
        public static void main(String[] args){
            int i=1;

            while (i <=10) {
                System.out.println(i);
                i++;
            }
        }
    }

============================== 7 Esse codigo é quase igual o anterior só que em vez de incrementar para "cima" 1,2,3... até 10 ele faz do 10 até 1 utilizando o incrimento no i ==============================
     public class Main {
    
        public static void main(String[] args){
            int i=10;

            while (i >=1) {
                System.out.println(i);
                i--;
            }
        }
    }

============================== 8 Esse codigo calcula a soma dos numeros 1 até 5 utilizando o laço de repetição while ==============================
    public class Main {
    
        public static void main(String[] args){
            int i=1;
            int soma=0;
            while (i<=5) {
                soma = soma +i;
                i++;
            }
            System.out.println("soma:"+ soma);
        }
    }


============================== 9 Esse codigo pede para o usuario digitar numeros que vai sendo amarzenada em uma variavel soma, cada numero q ele digitar é somado quando ele digitar 0
o programa para e a soma é mostrada ==============================
    import java.util.Scanner;

    public class ExemploWhile{
        public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int numero = 1;
        int soma = 0;
        while (numero !=0) {
            System.out.println("digite um numero:");
            numero = entrada.nextInt();

            soma = soma + numero;
        }
            System.out.println("soma total" + soma);
        }
    }


============================== 10 Nesse codigo é quase igual o anterior só q em vez do usuario digitar numeros aleatorios ele precisa digitar 1234 para assim sair do while e imprimir Acesso permetido ==============================
    import java.util.Scanner;

    public class ExemploWhile {
    
        public static void main(String[] args){
            Scanner entrada = new Scanner(System.in);
            int senha = 0;  
            while (senha !=1234) {
                System.out.println("digite um numero de uma senha:"); 
                senha = entrada.nextInt();              
            }
            System.out.println("Acesso permetido");
        }
    }
     */
