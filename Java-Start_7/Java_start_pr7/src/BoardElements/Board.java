
package BoardElements;

import GraphElements.*;

public class Board {

    private final Graph complete;


    public Board() {
        // create the complete graph
        // shuffle its edges
        complete = new Graph();
    }

    public Board(int i) {
//        complete = new Graph(n);
        complete = new Graph();
    }

    public synchronized Edge extract() {
        // replace the dots so that the board is thread-safe
        Edge edge = complete.pollFirst();
        return edge;
    }

    public boolean isEmpty() {
        return true;
    }
}
