import java.util.ArrayList;
interface Inteligente{
    void executarAcao();
}

class LampadaInteligente implements Inteligente{

    @Override
    public void executarAcao(){
        System.out.println("Lâmpada ligada...");
    }
}
class Alexa implements Inteligente{

    @Override
    public void executarAcao(){
        System.out.println("Alexa respondendo...");
    }
}

class ArCondicionado implements Inteligente{

    @Override
    public void executarAcao(){
        System.out.println("Temperatura ajustada...");
    }
}
public class Ex3{
    public static void main(String[] args) {

        ArrayList<Inteligente> dispositivos = new ArrayList<>();

        dispositivos.add(new LampadaInteligente());
        dispositivos.add(new Alexa());
        dispositivos.add(new ArCondicionado());

        for(Inteligente i : dispositivos){
            i.executarAcao();
        }

    }
}