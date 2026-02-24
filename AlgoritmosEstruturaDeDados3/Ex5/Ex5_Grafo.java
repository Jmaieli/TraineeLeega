import java.util.*;

public class Ex5_Grafo {

    private Map<Integer, List<Integer>> grafo = new HashMap<>();

    public void adicionarAresta(int origem, int destino) {
        grafo.putIfAbsent(origem, new ArrayList<>());
        grafo.get(origem).add(destino);
    }

    public void exibir() {
        System.out.println(grafo);
    }

    public static void main(String[] args) {
        Ex5_Grafo g = new Ex5_Grafo();
        g.adicionarAresta(1, 2);
        g.adicionarAresta(1, 3);
        g.adicionarAresta(2, 4);
        g.exibir();
    }
}