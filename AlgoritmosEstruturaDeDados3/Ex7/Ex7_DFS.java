import java.util.*;

public class Ex7_DFS {

    public static void dfs(Map<Integer, List<Integer>> grafo, int no, Set<Integer> visitado) {
        visitado.add(no);
        System.out.print(no + " ");

        for (int vizinho : grafo.getOrDefault(no, new ArrayList<>())) {
            if (!visitado.contains(vizinho)) {
                dfs(grafo, vizinho, visitado);
            }
        }
    }

    public static void main(String[] args) {
        Map<Integer, List<Integer>> grafo = new HashMap<>();
        grafo.put(1, Arrays.asList(2,3));
        grafo.put(2, Arrays.asList(4));
        grafo.put(3, Arrays.asList());
        grafo.put(4, Arrays.asList());

        dfs(grafo, 1, new HashSet<>());
    }
}