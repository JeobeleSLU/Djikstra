import java.util.*;

public class Node {
    private String name;
    private List<Edge>edges;
    int distance;

    public Node (String name){
        this.name = name;
        edges = new ArrayList<>();
    }

    /**
     *
     * @param end
     * @param weight
     *
     * adds the edges of the nodes
     */
    public void addEdge( Node end,int weight){
        this.edges.add(new Edge(this,end,weight));
    }

    public List<Edge> getEdges() {
        return edges;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Node node = (Node) obj;
        return Objects.equals(name, node.name); // Compare names
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    public void setDistance(int maxValue) {
        this.distance = maxValue;
    }

    public int getDistance() {
        return this.distance;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
