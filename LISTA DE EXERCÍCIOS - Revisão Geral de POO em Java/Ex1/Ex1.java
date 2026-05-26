import java.util.ArrayList;
abstract class Conteudo {

    private String titulo;
    protected double duracao;

    public Conteudo(String titulo, double duracao) {

        this.titulo = titulo;
        this.duracao = duracao;

    }

    abstract double calcularValorAssinatura();

    public String getTitulo() {

        return titulo;

    }

    public void mostrarInformacoes() {

        System.out.println("Título: " + titulo);
        System.out.println("Duração: " + duracao);

    }

}

class Filme extends Conteudo {

    public Filme(String titulo, double duracao) {

        super(titulo, duracao);

    }

    @Override
    double calcularValorAssinatura() {

        return 20 + 5;

    }

}

class Serie extends Conteudo {

    private int episodios;

    public Serie(String titulo, double duracao, int episodios) {

        super(titulo, duracao);
        this.episodios = episodios;

    }

    @Override
    double calcularValorAssinatura() {

        return 15 + episodios;

    }

}

class Documentario extends Conteudo {

    public Documentario(String titulo, double duracao) {

        super(titulo, duracao);

    }

    @Override
    double calcularValorAssinatura() {

        return 18;

    }
}
public class Ex1 {
    public static void main(String[] args) {

        ArrayList<Conteudo> conteudos = new ArrayList<>();

        conteudos.add(new Filme("JavaFilmes", 150));
        conteudos.add(new Serie("Supernatural", 45, 15));
        conteudos.add(new Documentario("AprendaJava", 120));

        for (Conteudo c : conteudos) {
            c.mostrarInformacoes();
            System.out.println("Valor: R$ " + c.calcularValorAssinatura());
            System.out.println("----------------");
        }
    }
}