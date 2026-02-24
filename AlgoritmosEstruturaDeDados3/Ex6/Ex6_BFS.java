import java.util.*;

public class Ex6_BFS {

    public static void bfs(Map<Integer, List<Integer>> grafo, int inicio) {
        Set<Integer> visitado = new HashSet<>();
        Queue<Integer> fila = new LinkedList<>();

        fila.add(inicio);
        visitado.add(inicio);

        while (!fila.isEmpty()) {
            int no = fila.poll();
            System.out.print(no + " ");

            for (int vizinho : grafo.getOrDefault(no, new ArrayList<>())) {
                if (!visitado.contains(vizinho)) {
                    visitado.add(vizinho);
                    fila.add(vizinho);
                }
            }
        }
    }

    public static void main(String[] args) {
        Map<Integer, List<Integer>> grafo = new HashMap<>();
        grafo.put(1, Arrays.asList(2,3));
        grafo.put(2, Arrays.asList(4));
        grafo.put(3, Arrays.asList());
        grafo.put(4, Arrays.asList());

        bfs(grafo, 1);
    }
}