# Weighted Graphs and Search Algorithms

## Classes Description

### Vertex
- **Purpose**: Represents a vertex in a graph.
- **Functionality**:
  - Stores data associated with a vertex.
  - Maintains a map of adjacent vertices along with the weight of the edges that connect them.
  - Provides methods to add and retrieve adjacent vertices and their corresponding weights.

### Edge
- **Purpose**: Represents a directed weighted edge between two vertices in the graph.
- **Functionality**:
  - Stores the source and destination vertices of the edge.
  - Keeps track of the weight associated with the edge.
  - Allows retrieval of the source vertex, destination vertex, and the weight of the edge.

### WeightedGraph
- **Purpose**: Manages a collection of vertices and edges to form a weighted graph.
- **Functionality**:
  - Holds a map where each vertex is associated with a list of outgoing edges.
  - Supports adding vertices to the graph.
  - Supports adding edges between vertices, including the weight of the edges.
  - Provides a method to retrieve all edges associated with a particular vertex, facilitating traversal and search operations.

### BreadthFirstSearch (BFS)
- **Purpose**: Implements the Breadth-First Search algorithm to traverse the graph.
- **Functionality**:
  - Can start traversal from any specified vertex.
  - Explores vertices in a breadthward motion, using a queue to track the next vertex to visit.
  - Visits each vertex once, ensuring all vertices are reached in the shortest path manner from the start vertex in terms of the number of edges.

### DijkstraSearch
- **Purpose**: Implements Dijkstra’s algorithm to find the shortest paths from a start vertex to all other vertices in the graph based on edge weight.
- **Functionality**:
  - Utilizes a priority queue to always extend the path from the currently known shortest path to the next closest vertex.
  - Computes the shortest paths from the start vertex to all other vertices in the graph, considering the weights of the edges.
  - Stores the shortest path distance to each vertex and the preceding vertex in the path for each visited vertex, allowing for path reconstruction.

### Main
- **Purpose**: Entry point of the program where instances of the graph and search classes are created and used.
- **Functionality**:
  - Instantiates the graph and adds vertices and edges to demonstrate the functionality of BFS and Dijkstra’s algorithm.
  - Runs both search algorithms and outputs the results to show how they work on the created graph.

## Usage
Use this code to understand how weighted graphs are implemented and how basic graph search algorithms like BFS and Dijkstra's algorithm operate on these structures. This project serves as an educational tool for those learning about graph theory and its applications in algorithm design.

