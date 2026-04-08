import java.util.Scanner;

class ContaBancaria {
    private String titular;
    private double Saldo;

    public void setTitular(String titular) {
        if (titular != null) {
            System.out.println("o usuario deve informar o titular!");
        } else {
            this.titular = titular;
        }
    }

    public String gettitular() {
        return titular;
    }

    public void setSaldo(double Saldo) {
        if (Saldo >= 1) {
            this.Saldo = Saldo;
        } else {
            this.Saldo = 0;
            System.out.println("o usuario deve informar o saldo!");
        }
    }

    public double getSaldo() {
        return Saldo;
    }
}

public class Ex4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.getSaldo();
        System.out.print("DIGITE O NOME DO TITULAR:");
        String nome = entrada.nextLine();
        contaBancaria.setTitular(nome);
        System.out.print("DIGITE AO SALDO INICIAL:");
        double saldoInicial = entrada.nextDouble();
        contaBancaria.setSaldo(saldoInicial);

        System.out.println("TITULAR:" + nome);
        System.out.println("Saldo:" + saldoInicial);

        entrada.close();

    }
}
