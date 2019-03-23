public class Edge {

    private Pair<Node, Node> drum;
    private int cost;
    private boolean accesibility;

    /**
     * actually builds the road (edge) between the two places (nodes)
     *
     * @param startNode    represent the first place(nodes) and the start of the edge
     * @param endNode      represent the second place(nodes) and the end of the edge
     * @param cost         represent an actual distance (in kilometers)
     * @param accesibility represent an one-way road(if it's false) or both-way road (if it't true)
     */
    public Edge(Node startNode, Node endNode, int cost, boolean accesibility) {
        drum = new Pair(startNode, endNode);
        this.cost = cost;
        this.accesibility = accesibility;
    }

    /**
     * actually builds the road (edge) between the two places (nodes)
     *
     * @param startNode    represent the first place(nodes) and the start of the edge
     * @param endNode      represent the second place(nodes) and the end of the edge
     * @param cost         represent an actual distance (in kilometers)
     */
    public Edge(Node startNode, Node endNode, int cost) {
        drum = new Pair(startNode, endNode);
        this.cost = cost;
        this.accesibility = true;
    }

}
