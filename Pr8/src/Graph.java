import java.util.*;

class Graph {
    private final Map<Integer, List<Edge>> adjacencyMap = new HashMap<>();

    public void addEdge(int u, int v, int weight) {
        adjacencyMap.putIfAbsent(u, new ArrayList<>());
        adjacencyMap.putIfAbsent(v, new ArrayList<>());
        adjacencyMap.get(u).add(new Edge(v, weight));
        adjacencyMap.get(v).add(new Edge(u, weight));
    }

    public List<Edge> getNeighbors(int vertex) {
        return adjacencyMap.getOrDefault(vertex, new ArrayList<>());
    }

    static class Edge {
        int to;
        int weight;

        Edge(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }
    }
}
