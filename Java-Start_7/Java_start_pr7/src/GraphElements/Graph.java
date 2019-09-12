package GraphElements;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Graph {
    private List<Edge> allEdge;
    static boolean verification = false;
    static int countGame = 0;
    private static int numberOfEdges;
    private static int numberOfVertexes;
    private static int vertex;
    private List<Node> allNode;

    public Graph() {
        allEdge = new ArrayList<>();
        allNode = new ArrayList<>();
    }

    public void add(Edge edge) {
        this.allEdge.add(edge);
    }

    public Edge pollFirst() {
        return allEdge.get(0);
    }

    public boolean isSpanningTree() {

//        while (verification == false) {
//            countGame++;
//            if (countGame == 10)
//                verification = true;
//        }
//        return true;
//    }
        return true;
    }

    public void DFSUtil(int vertex, boolean visited[]) {
        visited[vertex] = true;
//        Iterator<Integer> i =
    }

    public void DFS(int vertex) {
        boolean visited[] = new boolean[numberOfVertexes];
        DFSUtil(vertex, visited);
    }

}