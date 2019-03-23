import java.util.ArrayList;
import java.util.List;

public class TravelMap {
    private List<Edge> edges;
    private List<Node> nodes;

    /**
     * create the map
     */
    public TravelMap() {
        nodes = new ArrayList<>();
        edges = new ArrayList<>();
    }

    /**
     * add a location in a list
     *
     * @param node is a location (church, museum etc)
     */
    public void addNode(Node node) {
        boolean ignore = false;
        for (Node n2 : this.nodes) {
            if (node.equals(n2))
                ignore = true;
        }
        if (!ignore)
            this.nodes.add(node);
    }

    /**
     * add a road (edge) in a list
     *
     * @param nodeStart    start of the "road" (edge)
     * @param nodeFinal    end of the "road" (edge)
     * @param cost         represent an actual distance (in kilometers)
     * @param accesibility represent an one-way road(if it's false) or both-way road (if it't true)
     */
    public void addEdge(Node nodeStart, Node nodeFinal, int cost, boolean accesibility) {
        edges.add(new Edge(nodeStart, nodeFinal, cost, accesibility));
    }

    /**
     * add a road (edge) in a list
     *
     * @param nodeStart start of the "road" (edge)
     * @param nodeFinal end of the "road" (edge)
     * @param cost      represent an actual distance (in kilometers)
     */
    public void addEdge(Node nodeStart, Node nodeFinal, int cost) {
        edges.add(new Edge(nodeStart, nodeFinal, cost));
    }

    /**
     * @return a list of nodes
     */
    public List<Node> getNodes() {
        return nodes;
    }

    /**
     * @return the object formatted as a string to be displayed
     */
    @Override
    public String toString() {
        return "TravelMap{" +
                "nodes=" + nodes +
                ", edges=" + edges +
                '}';
    }

}
