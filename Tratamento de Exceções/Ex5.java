class ContaBancaria{
    private double saldo = 1500;

    public void sacar(double valor) throws saldoInsuficienteException{
        if(valor>saldo){
            throw new saldoInsuficienteException("Saldo insuficiente!");
        }
        saldo -= valor;

        System.out.println("SAQUE REALIZADO!");
    }
}
class saldoInsuficienteException extends Exception{
    public saldoInsuficienteException(String mensagem){
        super(mensagem);
    }
}

public class Ex5 {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        try {
            conta.sacar(1000);
        } catch (saldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
    }
}
