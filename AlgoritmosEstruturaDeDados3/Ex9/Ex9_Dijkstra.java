import java.util.*;

public class Ex9_Dijkstra {

    static class Aresta {
        int destino, peso;
        Aresta(int d, int p) { destino = d; peso = p; }
    }

    public static void dijkstra(Map<Integer, List<Aresta>> grafo, int inicio) {
        Map<Integer, Integer> dist = new HashMap<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));

        pq.add(new int[]{inicio, 0});
        dist.put(inicio, 0);

        while (!pq.isEmpty()) {
            int[] atual = pq.poll();
            int no = atual[0];
            int d = atual[1];

            for (Aresta a : grafo.getOrDefault(no, new ArrayList<>())) {
                int novaDist = d + a.peso;

                if (!dist.containsKey(a.destino) || novaDist < dist.get(a.destino)) {
                    dist.put(a.destino, novaDist);
                    pq.add(new int[]{a.destino, novaDist});
                }
            }
        }

        System.out.println(dist);
    }

    public static void main(String[] args) {
        Map<Integer, List<Aresta>> grafo = new HashMap<>();

        grafo.put(1, Arrays.asList(new Aresta(2,4), new Aresta(3,1)));
        grafo.put(2, Arrays.asList(new Aresta(4,1)));
        grafo.put(3, Arrays.asList(new Aresta(2,2), new Aresta(4,5)));
        grafo.put(4, new ArrayList<>());

        dijkstra(grafo, 1);
    }
}