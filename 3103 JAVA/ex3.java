class Carro{
    String marca;
    String modelo;

public Carro(){}

public Carro (String marca, String modelo){
    this.marca = marca;
    this.modelo = modelo;
}
}

public class ex3 {
    public static void main(String[] args) {
        Carro c = new Carro("BMW", "GT");
        System.out.println("Marca: " + c.marca + " Modelo: " + c.modelo);
    }
}
