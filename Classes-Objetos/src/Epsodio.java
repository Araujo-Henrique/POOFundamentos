import java.util.ArrayList; // Importamos a ferramenta de Lista do Java

class Episodio {
    String titulo;
    int duracao;

    // Construtor
    public Episodio(String titulo, int duracao) {
        this.titulo = titulo;
        this.duracao = duracao;
    }

    // Método para mostrar os dados na tela
    public void imprimirInfo() {
        System.out.println("Episódio: " + this.titulo + " (" + this.duracao + " min)");
    }
}