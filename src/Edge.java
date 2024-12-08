
public class Edge {
    private int distance;
    private int id = 0;
    private static int nextId = 0;
    Node start;
    Node end;

    public Edge(Node start,Node end, int distance){
        this.start = start;
        this.end = end;
        this.distance = distance;
        this.id = nextId++;

    }

    public Node getEnd() {
        return end;
    }

    public Node getStart() {
        return start;
    }

    public int getDistance() {
        return distance;
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
        return "(" + this.start.toString() + "," + this.end.toString() + ":" + this.distance + ")";
    }
}
