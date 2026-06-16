import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // 1. Criamos o ArrayList
        // O <Episodio> entre os sinais avisa que essa lista SÓ aceita Episódios
        ArrayList<Episodio> minhaLista = new ArrayList<>();

        // 2. Criamos alguns episódios usando o construtor lá de cima
        Episodio ep1 = new Episodio("O Começo", 45);
        Episodio ep2 = new Episodio("A Reviravolta", 50);
        Episodio ep3 = new Episodio("O Grande Final", 60);

        // 3. Guardamos eles dentro da lista (.add)
        minhaLista.add(ep1);
        minhaLista.add(ep2);
        minhaLista.add(ep3);

        // Criando e adicionando na mesma linha na mesma linha:
        minhaLista.add(new Episodio("Episódio Extra", 25));

        // 4. Verificando quantos itens temos (.size)
        System.out.println("Total de episódios na lista: " + minhaLista.size());
        System.out.println("-----------------------------");

        // 5. Percorrendo a lista com um loop "for-each"
        // Leia isto como "para cada 'item' do tipo Episodio que estiver na 'minhaLista'..."
        for (Episodio item : minhaLista) {
            // O Java pega um por um e coloca na variável 'item'
            item.imprimirInfo();
        }
    }
}