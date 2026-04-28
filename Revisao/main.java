import java.util.ArrayList;
class Cliente {
    private String Nome;
    private String Cpf;

    public Cliente(String Nome, String Cpf) {
        this.Nome = Nome;
        if (Cpf != null && !Cpf.isEmpty()) {
            this.Cpf = Cpf;
        } else {
            System.out.println("CPF INVALIDO!");
        }
    }

    public String getNome() {
        return Nome;
    }

    public String getCpf() {
        return Cpf;
    }
}

class Carro {
    private String Marca;
    private String Modelo;
    private Double Preco;

    public Carro(String Marca, String Modelo, Double Preco) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        if (Preco >= 0) {
            this.Preco = Preco;
        } else {
            System.out.println("PREÇO INVALIDO");
        }
    }

    public String getMarca() {
        return Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public Double getPreco() {
        return Preco;
    }

    public void aplicarDesconto(Double percentual) {
        if (percentual > 0 && percentual <= 100) {
            Preco -= Preco * (percentual / 100);
        } else {
            System.out.println("PERCENTUAL INVALIDO!");
        }
    }
}

class Estoque {
    private ArrayList<Carro> carros;

    public Estoque() {
        carros = new ArrayList<>();
    }

    public void adicionarCarro(Carro carro) {
        carros.add(carro);
    }

    public void listarCarro() {
        System.out.println("======ESTOQUE=====");

        for (Carro c : carros) {
            System.out.println(c.getMarca() + "-" + c.getModelo() + "- R$" + c.getPreco());
        }
    }

    public double calcularTotalestoque() {
        double total = 0;
        for (Carro c : carros) {
            total += c.getPreco();
        }
        return total;
    }
}

class Venda {
    private Cliente cliente;
    private Carro carro;

    public Venda(Cliente cliente, Carro carro) {
        this.cliente = cliente;
        this.carro = carro;
    }

    public void MostrarResumoVendas() {
        System.out.println("\n====VENDAS====");
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("carro " + carro.getMarca() + " " + carro.getModelo());
        System.out.println("Preço: " + carro.getPreco());
    }
}

public class main {
    public static void main(String[] args){
        Cliente Cliente = new Cliente ("Luiz", "23245532");

        Carro c1 = new Carro("Cao Cherry", "Tiggo 7 sport", 150000.00);
        Carro c2 = new Carro("fIATO", "Argo", 80000.00);
        Carro c3 = new Carro("Toyota", "Corolla", 120000.00);

        c1.aplicarDesconto(15);

        Estoque estoque = new Estoque();

        estoque.adicionarCarro(c1);estoque.adicionarCarro(c2);estoque.adicionarCarro(c3);

        estoque.listarCarro();

        System.out.println("Valor total do estoque: R$ "+estoque.calcularTotalestoque());
        Venda venda = new Venda(cliente, c1);
    } 

}