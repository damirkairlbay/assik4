import java.util.*;

public class DijkstraSearch<V> {
    public void dijkstra(Vertex<V> start, WeightedGraph<V> graph) {
        Map<Vertex<V>, Double> distances = new HashMap<>();
        PriorityQueue<Vertex<V>> pq = new PriorityQueue<>(Comparator.comparing(distances::get));
        Map<Vertex<V>, Vertex<V>> predecessor = new HashMap<>();
        Set<Vertex<V>> visited = new HashSet<>();

        for (Vertex<V> v : graph.map.keySet()) {
            distances.put(v, Double.MAX_VALUE);
        }
        distances.put(start, 0.0);
        pq.add(start);

        while (!pq.isEmpty()) {
            Vertex<V> current = pq.poll();
            visited.add(current);

            for (Map.Entry<Vertex<V>, Double> adj : current.getAdjacentVertices().entrySet()) {
                Vertex<V> neighbor = adj.getKey();
                double weight = adj.getValue();
                if (!visited.contains(neighbor)) {
                    double newDist = distances.get(current) + weight;
                    if (newDist < distances.get(neighbor)) {
                        distances.put(neighbor, newDist);
                        predecessor.put(neighbor, current);
                        pq.add(neighbor);
                    }
                }
            }
        }
    }
}
