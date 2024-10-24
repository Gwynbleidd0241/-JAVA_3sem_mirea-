public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addEdge(0, 1, 5);
        graph.addEdge(0, 2, 2);
        graph.addEdge(1, 2, 4);
        graph.addEdge(1, 3, 1);
        graph.addEdge(2, 3, 7);
        graph.addEdge(3, 4, 3);
        graph.addEdge(4, 5, 6);
        graph.addEdge(2, 5, 1);

        int countV = 6;
        Parallel parallel = new Parallel(graph, countV);
        int startV = 0;
        parallel.execute(startV);

        int[] distances = parallel.getDistances();
        for (int i = 1; i < distances.length; i++) {
            System.out.println("Вершина " + i + ": " + distances[i]); // Я не знаю, как вам лучше вывести ( поэтому поставил i := 1,
            // нулевая вершина это начало графа -> а последующий вывод это расстояние от начальной к i вершине)
        }
    }
}

