public class Main {
    public static void main(String[] args) {
        WeightedGraph<String> graph = new WeightedGraph<>();
        Vertex<String> a = new Vertex<>("A");
        Vertex<String> b = new Vertex<>("B");
        Vertex<String> c = new Vertex<>("C");

        graph.addVertex(a);
        graph.addVertex(b);
        graph.addVertex(c);

        graph.addEdge(a, b, 1.0);
        graph.addEdge(b, c, 2.0);
        graph.addEdge(c, a, 3.0);

        BreadthFirstSearch<String> bfs = new BreadthFirstSearch<>();
        bfs.bfs(a);

        DijkstraSearch<String> dijkstra = new DijkstraSearch<>();
        dijkstra.dijkstra(a, graph);
    }
}
