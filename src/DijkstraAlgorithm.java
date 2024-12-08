import java.util.*;

public class DijkstraAlgorithm {

    public static void dijkstra(Node source) {
        PriorityQueue<Node> queue = new PriorityQueue<>(Comparator.comparingInt(Node::getWeight));
        source.setWeight(0); // Distance to itself is zero
        queue.add(source);

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            for (Edge edge : current.getEdges()) {
                Node neighbor = edge.getEnd();
                int newDistance = current.getWeight() + edge.getDistance();

                // Update the distance if the new distance is smaller
                if (newDistance < neighbor.getWeight()) {
                    neighbor.setWeight(newDistance);
                    queue.add(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        // Create nodes
        Node a = new Node("A");
        Node b = new Node("B");
        Node c = new Node("C");
        Node d = new Node("D");

        // Create edges
        a.addEdge(b, 1);
        a.addEdge(c, 4);
        b.addEdge(c, 2);
        b.addEdge(d, 6);
        c.addEdge(d, 3);

        // Set initial distances to infinity (max value)
        for (Node node : Arrays.asList(a, b, c, d)) {
            node.setWeight(Integer.MAX_VALUE);
        }

        // Run Dijkstra from source node A
        dijkstra(a);

        // Print distances
        for (Node node : Arrays.asList(a, b, c, d)) {
            System.out.println("Distance from A to " + node.getName() + ": " + node.getWeight());
        }
    }
}
