package drawing;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.util.Objects;

public class NodeShape extends Ellipse2D.Double {
    private Color fillColor;
    private Color strokeColor;

    public NodeShape(double x, double y, double radius, Color fillColor, Color strokeColor) {
        super(x - radius / 2, y - radius / 2, radius, radius);
        this.fillColor = fillColor;
        this.strokeColor = strokeColor;
    }

    public Color getFillColor() {
        return fillColor;
    }

    public Color getStrokeColor() {
        return strokeColor;
    }

    @Override
    public String toString() {
        return "NodeShape{" +
                "x=" + x +
                ", y=" + y +
                ", width=" + width +
                ", height=" + height +
                ", fillColor=" + fillColor +
                ", strokeColor=" + strokeColor +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        NodeShape nodeShape = (NodeShape) o;
        return Objects.equals(fillColor, nodeShape.fillColor) &&
                Objects.equals(strokeColor, nodeShape.strokeColor) &&
                (this.x == nodeShape.x && this.y == nodeShape.y && this.width == nodeShape.width && this.height == nodeShape.height);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), fillColor, strokeColor);
    }
}