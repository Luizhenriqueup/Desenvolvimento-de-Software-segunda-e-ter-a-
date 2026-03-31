class Veiculo{
    String Marca;
    String Modelo;
}
class Carro extends Veiculo{
    String portas;
}
class Moto extends Veiculo{
    double cilindradas;
}



public class ex3 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.Marca = "BMW";
        carro1.Modelo = "GT3";
        carro1.portas = "2";

        Moto moto1 = new Moto();
        moto1.Marca = "HONDA";
        moto1.Modelo = "CG25";
        moto1.cilindradas = 1.5;
        

        System.out.println("CARRO:");
        System.out.println("MARCA: " + carro1.Marca);
        System.out.println("MODELO: " + carro1.Modelo);
        System.out.println("PORTAS: " + carro1.portas);
        System.out.println("=================");
        System.out.println("MOTO:");
        System.out.println("MARCA: " + moto1.Marca);
        System.out.println("MODELO: " + moto1.Modelo);
        System.out.println("CILINDRADAS: " + moto1.cilindradas);
    }
}
