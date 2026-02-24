import java.util.*;

public class Ex10_Topologico {

    public static void topologico(Map<Integer, List<Integer>> grafo) {
        Set<Integer> visitado = new HashSet<>();
        Stack<Integer> pilha = new Stack<>();

        for (int no : grafo.keySet()) {
            if (!visitado.contains(no))
                dfs(grafo, no, visitado, pilha);
        }

        while (!pilha.isEmpty()) {
            System.out.print(pilha.pop() + " ");
        }
    }

    private static void dfs(Map<Integer, List<Integer>> grafo,
                            int no,
                            Set<Integer> visitado,
                            Stack<Integer> pilha) {

        visitado.add(no);

        for (int vizinho : grafo.getOrDefault(no, new ArrayList<>())) {
            if (!visitado.contains(vizinho))
                dfs(grafo, vizinho, visitado, pilha);
        }

        pilha.push(no);
    }

    public static void main(String[] args) {
        Map<Integer, List<Integer>> grafo = new HashMap<>();
        grafo.put(5, Arrays.asList(2,0));
        grafo.put(4, Arrays.asList(0,1));
        grafo.put(2, Arrays.asList(3));
        grafo.put(3, Arrays.asList(1));
        grafo.put(1, new ArrayList<>());
        grafo.put(0, new ArrayList<>());

        topologico(grafo);
    }
}