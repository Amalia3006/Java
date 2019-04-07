package drawing;

import java.awt.*;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.List;

public class Graph {
    private List<NodeShape> nodesList;
    private List<EdgeShape> edgesList;

    public Graph() {
        nodesList = new ArrayList<>();
        edgesList = new ArrayList<>();
    }

    public void addNode(double x, double y, double radius, Color fillColor, Color strokeColor) {
        nodesList.add(new NodeShape(x, y, radius, fillColor, strokeColor));
    }

    public void addNode(NodeShape nodeShape) {
        nodesList.add(nodeShape);
    }

    public void addEdge(double x1, double y1, double x2, double y2, Color color) {
        edgesList.add(new EdgeShape(x1, y1, x2, y2, color));
    }

    public void addEdge(EdgeShape edgeShape) {
        edgesList.add(edgeShape);
    }

    public List<NodeShape> getNodes() {
        return nodesList;
    }

    public List<EdgeShape> getEdges() {
        return edgesList;
    }

    public void removeElement(double x, double y) {
        for(NodeShape nodeShape : nodesList) {
            if(nodeShape.contains(x, y)) {
                nodesList.remove(nodeShape);
                return;
            }
        }

        Rectangle2D mouseAOE = new Rectangle2D.Double(x - 20, y - 20, 40, 40);
        for(EdgeShape edgeShape : edgesList) {
            if(edgeShape.intersects(mouseAOE)) {
                edgesList.remove(edgeShape);
                return;
            }
        }
    }

    public Point2D hoverNode(int x, int y) {
        Rectangle2D mouseAOE = new Rectangle2D.Double(x - 20, y - 20, 40, 40);
        for(NodeShape nodeShape : nodesList) {
            if(nodeShape.intersects(mouseAOE))
                return new Point2D.Double(nodeShape.getCenterX(), nodeShape.getCenterY());
        }
        return null;
    }
}
