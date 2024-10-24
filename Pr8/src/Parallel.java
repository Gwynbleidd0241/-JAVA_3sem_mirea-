import java.util.*;
import java.util.concurrent.*;

public class Parallel {
    private final Graph graph;
    private final int countV;
    private final int[] distances;
    private final ExecutorService executor = Executors.newCachedThreadPool();

    public Parallel(Graph graph, int countV) {
        this.graph = graph;
        this.countV = countV;
        this.distances = new int[countV];
        Arrays.fill(distances, Integer.MAX_VALUE);
    }

    public void execute(int startV) {
        distances[startV] = 0;
        Queue<Integer> queue = new ConcurrentLinkedQueue<>();
        queue.add(startV);

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Future<?>> futures = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                Integer currentVertex = queue.poll();
                if (currentVertex != null) {
                    futures.add(executor.submit(() -> processVertex(currentVertex, queue)));
                }
            }

            for (Future<?> future : futures) {
                try {
                    future.get();
                } catch (InterruptedException | ExecutionException e) {
                    e.printStackTrace();
                }
            }
        }
        executor.shutdown();
    }

    private void processVertex(int currentV, Queue<Integer> queue) {
        for (Graph.Edge edge : graph.getNeighbors(currentV)) {
            int neighbor = edge.to;
            int newDist = distances[currentV] + edge.weight;

            synchronized (distances) {
                if (newDist < distances[neighbor]) {
                    distances[neighbor] = newDist;
                    queue.add(neighbor);
                }
            }
        }
    }

    public int[] getDistances() {
        return distances;
    }
}
