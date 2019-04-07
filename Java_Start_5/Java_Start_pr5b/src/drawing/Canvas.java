package drawing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Point2D;
import java.util.List;

public class Canvas extends JPanel {
    private final DrawingFrame drawingFrame;

    private Graph graph;

    private final int width, height;

    private EdgeShape tempEdgeShape;

    public Canvas(DrawingFrame drawingFrame) {
        this(drawingFrame, 1280, 720);
    }

    public Canvas(DrawingFrame drawingFrame, int width, int height) {
        graph = new Graph();

        this.width = width;
        this.height = height;
        this.setPreferredSize(new Dimension(this.width, this.height));

        this.drawingFrame = drawingFrame;

        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if(e.getButton() == MouseEvent.BUTTON1) {
                    graph.addNode(e.getX(), e.getY(), drawingFrame.getRadius(), drawingFrame.getFillColor(), drawingFrame.getStrokeColor());
                    Canvas.this.repaint();
                }
                else if(e.getButton() == MouseEvent.BUTTON3) {
                    Point2D center = graph.hoverNode(e.getX(), e.getY());
                    if(center != null) {
                        tempEdgeShape = new EdgeShape(center.getX(), center.getY(), center.getX(), center.getY(), drawingFrame.getFillColor());
                    }
                }
                else if(e.getButton() == MouseEvent.BUTTON2 ) {
                    graph.removeElement(e.getX(), e.getY());
                    Canvas.this.repaint();
                }
            }
            @Override
            public void mouseReleased(MouseEvent e) {
                if(tempEdgeShape != null) {
                    Point2D center = graph.hoverNode(e.getX(), e.getY());
                    if(center != null) {
                        graph.addEdge(tempEdgeShape);
                    }
                    tempEdgeShape = null;
                    Canvas.this.repaint();
                }
            }
        });

        this.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                if(tempEdgeShape != null) {
                    Point2D center = graph.hoverNode(e.getX(), e.getY());
                    if(center != null) {
                        tempEdgeShape.setPoint2(center.getX(), center.getY());
                    }
                    else tempEdgeShape.setPoint2(e.getX(), e.getY());
                    Canvas.this.repaint();
                }
            }
        });
    }

    public void drawNode(int x, int y) {
        this.repaint();
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D graphics2D = (Graphics2D) g;

        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); //for "smooth" drawing
        super.paint(g);

        graphics2D.setColor(new Color(174, 180, 12)); // background color
        graphics2D.fillRect(0, 0, (int)this.getPreferredSize().getWidth(), (int)this.getPreferredSize().getHeight());

        if(tempEdgeShape != null) {
            graphics2D.setColor(tempEdgeShape.getColor());
            graphics2D.draw(tempEdgeShape);
        }
        List<EdgeShape> edges = graph.getEdges();
        for(EdgeShape edge : edges) {
            graphics2D.setColor(edge.getColor());
            graphics2D.draw(edge);
        }

        List<NodeShape> nodes = graph.getNodes();
        for(NodeShape node : nodes) {
            graphics2D.setColor(node.getFillColor());
            graphics2D.fill(node);

            graphics2D.setColor(node.getStrokeColor());
            graphics2D.setStroke(new BasicStroke(drawingFrame.getStrokeWeight()));
            graphics2D.draw(node);
        }
    }

    public void reset() {
        graph = new Graph();
        this.repaint();
    }
}
