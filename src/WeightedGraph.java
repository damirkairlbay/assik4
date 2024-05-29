import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WeightedGraph<V> {
    private Map<Vertex<V>, List<Edge<Vertex<V>>>> map = new HashMap<>();

    public void addVertex(Vertex<V> vertex) {
        map.put(vertex, new ArrayList<>());
    }

    public void addEdge(Vertex<V> source, Vertex<V> dest, double weight) {
        map.get(source).add(new Edge<>(source, dest, weight));
        map.get(dest).add(new Edge<>(dest, source, weight));
    }

    public List<Edge<Vertex<V>>> getEdges(Vertex<V> vertex) {
        return map.get(vertex);
    }
}
