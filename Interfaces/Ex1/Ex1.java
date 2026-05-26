import java.util.ArrayList;
interface Notificacao{
    void enviarMensagem();
}

class Email implements Notificacao{

    @Override
    public void enviarMensagem(){
        System.out.println("Email enviado!");
    }
}

class SMS implements Notificacao{

    @Override
    public void enviarMensagem(){
        System.out.println("SMS enviado!");
    }
}

class WhatsApp implements Notificacao{

    @Override
    public void enviarMensagem(){
        System.out.println("Mensagem no WhatsApp enviada!");
    }
}

public class Ex1{
    public static void main(String[] args) {

        ArrayList<Notificacao> notificacoes = new ArrayList<>();

        notificacoes.add(new Email());
        notificacoes.add(new SMS());
        notificacoes.add(new WhatsApp());

        for(Notificacao n : notificacoes){
            n.enviarMensagem();
        }
    }
}