public class Exemplo {

    public static void main(String[] args) {
        final double PI = 3.14;

        System.out.println(PI);

        double raio = 10;
        PI = 10; // ERRO: NAO E POSSIVEL ATRIBUIR UM VALOR A UMA CONSTANTE PORQUE EU ESTOU USANDO FINAL
        double area = PI * raio * raio;
        System.out.println("Area do circulo: " + area);
    }
}