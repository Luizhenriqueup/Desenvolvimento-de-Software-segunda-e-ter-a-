import java.util.ArrayList;
abstract class Veiculo{
    public abstract double calcularAlugel(int dias);
}
class Carro extends Veiculo{
    @Override
    public double calcularAlugel(int dias){
        return dias * 100;
    }
}
class Moto extends Veiculo{
    @Override
    public double calcularAlugel(int dias){
        return dias * 50;
    }
}
class Caminhao extends Veiculo{
    @Override
    public double calcularAlugel(int dias){
        return dias * 150;
    }
}

public class Ex5 {
    public static void main(String[] args) {
        ArrayList<Veiculo> lista = new ArrayList<>();

        lista.add(new Carro());
        lista.add(new Moto());
        lista.add(new Caminhao());

        for(Veiculo v: lista){
            System.out.println("veiculos: " + v.calcularAlugel(3));
        }
    }
}
