/*class Contabancaria{
    private String titular;
    private double saldo;

    final double TAXA_BANCARIA = 2;

    public Contabancaria(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }
    public void sacar(double valor){
    if(saldo > valor + TAXA_BANCARIA){
        saldo -= valor;
        saldo -= TAXA_BANCARIA;
    }else{
        System.out.println("SALDO INSUFICIENTE");
    }

    System.out.println("SALDO: " + saldo);
}
}
public class Ex2 {
    public static void main(String[] args) {
        Contabancaria c1 = new Contabancaria("Luiz", 1000);
        c1.sacar(100);
    }
}*/
