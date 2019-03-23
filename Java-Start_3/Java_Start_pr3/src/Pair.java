public class Pair<T, V> {
    private T firstNode;
    private V secondNode;

    /**
     * make an edge between two nodes
     *
     * @param firstNode  represent the first place(nodes) and the start of the edge
     * @param secondNode represent the second place(nodes) and the end of the edge
     */
    public Pair(T firstNode, V secondNode) {
        this.firstNode = firstNode;
        this.secondNode = secondNode;
    }

    /**
     * @return the first place(nodes) which is the start of the edge
     */
    public T getFirst() {
        return firstNode;
    }

    /**
     * set the start of the edge
     *
     * @param firstNode the first place(nodes) and the start of the edge
     */
    public void setFirst(T firstNode) {
        this.firstNode = firstNode;
    }

    /**
     * @return the second place(nodes) which is the end of the edge
     */
    public V getSecond() {
        return secondNode;
    }

    /**
     * set the end of the edge
     *
     * @param secondNode represent the second place(nodes) and the end of the edge
     */
    public void setSecond(V secondNode) {
        this.secondNode = secondNode;
    }
}
