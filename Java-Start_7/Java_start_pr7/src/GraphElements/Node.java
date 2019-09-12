package GraphElements;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private int node;
    private List<Edge> allEdge;
    private List<Integer> allNodes;


    public Node() {
        this.allEdge = new ArrayList<>();
        for (Edge edge : allEdge) {
            for (int nodeVerification : allNodes)
                if ((nodeVerification != edge.getSource()) && (nodeVerification != edge.getDestination()))
                    allNodes.add(edge.getSource());
        }
    }

    public int getNumberOfNode() {
        return allNodes.size();
    }

}
