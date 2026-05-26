import java.util.ArrayList;

abstract class FuncionarioHospital {

    private String nome;
    protected double salarioBase;

    public FuncionarioHospital(String nome, double salarioBase) {

        this.nome = nome;
        this.salarioBase = salarioBase;

    }

    abstract double calcularSalario();

    public String getNome() {

        return nome;

    }

}

class Medico extends FuncionarioHospital {

    public Medico(String nome, double salarioBase) {

        super(nome, salarioBase);

    }

    @Override
    double calcularSalario() {

        return salarioBase + 3000;

    }

}

class Enfermeiro extends FuncionarioHospital {

    public Enfermeiro(String nome, double salarioBase) {

        super(nome, salarioBase);

    }

    @Override
    double calcularSalario() {

        return salarioBase + 1200;

    }

}

class Recepcionista extends FuncionarioHospital {

    public Recepcionista(String nome, double salarioBase) {

        super(nome, salarioBase);

    }

    @Override
    double calcularSalario() {

        return salarioBase;

    }

}

public class Ex2 {

    public static void main(String[] args) {

        ArrayList<FuncionarioHospital> funcionarios = new ArrayList<>();

        funcionarios.add(new Medico("Luiz", 7200));
        funcionarios.add(new Enfermeiro("Henrique", 3300));
        funcionarios.add(new Recepcionista("Silva", 2500));

        double maior = 0;
        String nomeMaior = "";

        for (FuncionarioHospital f : funcionarios) {

            double salario = f.calcularSalario();

            System.out.println(f.getNome() + " - R$ " + salario);

            if (salario > maior) {

                maior = salario;
                nomeMaior = f.getNome();

            }

        }

        System.out.println("\nMaior salário: " + nomeMaior);

    }

}