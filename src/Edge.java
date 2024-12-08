
public class Edge {
    private int weight;
    private int id = 0;
    private static int nextId = 0;
    Node start;
    Node end;

    public Edge(Node start,Node end, int weight){
        this.start = start;
        this.end = end;
        this.weight = weight;
        this.id = nextId++;

    }

    public Node getEnd() {
        return end;
    }

    public Node getStart() {
        return start;
    }

    public int getWeight() {
        return weight;
    }

    /*
    For better implrementation of hashmaps i override these
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Edge edge = (Edge) obj;
        return id == edge.id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }

    public String toString(){
        return "(" + this.start.toString() + "," + this.end.toString() + ":" + this.weight + ")";
    }
}
