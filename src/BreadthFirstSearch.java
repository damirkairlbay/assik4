import java.util.*;

public class BreadthFirstSearch<V> {
    public void bfs(Vertex<V> start) {
        Queue<Vertex<V>> queue = new LinkedList<>();
        Set<Vertex<V>> visited = new HashSet<>();

        queue.add(start);
        visited.add(start);

        while (!queue.isEmpty()) {
            Vertex<V> vertex = queue.poll();
            System.out.println("Visited: " + vertex.getData());
            for (Vertex<V> v : vertex.getAdjacentVertices().keySet()) {
                if (!visited.contains(v)) {
                    visited.add(v);
                    queue.add(v);
                }
            }
        }
    }
}
