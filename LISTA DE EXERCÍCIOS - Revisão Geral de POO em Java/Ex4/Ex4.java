import java.util.ArrayList;
abstract class PlanoAcademia {

    private String nomeAluno;
    protected double valorMensal;

    public PlanoAcademia(String nomeAluno, double valorMensal) {

        this.nomeAluno = nomeAluno;
        this.valorMensal = valorMensal;

    }

    abstract double calcularMensalidade();

    public String getNomeAluno() {

        return nomeAluno;

    }

}

class PlanoBasico extends PlanoAcademia {

    public PlanoBasico(String nomeAluno, double valorMensal) {

        super(nomeAluno, valorMensal);

    }

    @Override
    double calcularMensalidade() {

        return valorMensal;

    }

}

class PlanoPremium extends PlanoAcademia {

    public PlanoPremium(String nomeAluno, double valorMensal) {

        super(nomeAluno, valorMensal);

    }

    @Override
    double calcularMensalidade() {

        return valorMensal + 400;

    }

}

class PlanoVIP extends PlanoAcademia {

    final double DESCONTO_MAXIMO = 40;

    public PlanoVIP(String nomeAluno, double valorMensal) {

        super(nomeAluno, valorMensal);

    }

    @Override
    double calcularMensalidade() {

        return (valorMensal + 150) - DESCONTO_MAXIMO;

    }

}
public class Ex4 {

    public static void main(String[] args) {

        ArrayList<PlanoAcademia> planos = new ArrayList<>();

        planos.add(new PlanoBasico("Luiz", 230));
        planos.add(new PlanoPremium("Henrique", 111));
        planos.add(new PlanoVIP("Silva", 440));

        for (PlanoAcademia p : planos) {

            System.out.println(p.getNomeAluno());
            System.out.println("Mensalidade: R$ " + p.calcularMensalidade());
            System.out.println("----------------");
        }
    }
}