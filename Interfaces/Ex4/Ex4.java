import java.util.ArrayList;
interface Transportavel{
    void realizarEntrega();
}

class Caminhao implements Transportavel{

    @Override
    public void realizarEntrega(){
        System.out.println("Caminhão realizou entrega");
    }

    public void mostrarStatus(){
        System.out.println("Caminhão em movimento");
    }
}

class DroneEntrega implements Transportavel{

    @Override
    public void realizarEntrega(){
        System.out.println("Drone realizou entrega");
    }

    public void mostrarStatus(){
        System.out.println("Drone voando");
    }
}
class MotoEntrega implements Transportavel{

    @Override
    public void realizarEntrega(){
        System.out.println("Moto realizou entrega");
    }

    public void mostrarStatus(){
        System.out.println("Moto saiu para entrega");
    }
}

public class Ex4{
    public static void main(String[] args) {
        ArrayList<Transportavel> entregas = new ArrayList<>();

        entregas.add(new Caminhao());
        entregas.add(new DroneEntrega());
        entregas.add(new MotoEntrega());

        for(Transportavel t : entregas){
            t.realizarEntrega();
        }

    }
}