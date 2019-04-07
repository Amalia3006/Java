package drawing;

import java.awt.*;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.Objects;

public class EdgeShape extends Line2D.Double {
    private Color color;

    public EdgeShape(double x1, double y1, double x2, double y2, Color color) {
        super(x1, y1, x2, y2);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setPoint2(double x2, double y2) {
        super.setLine(super.getP1(), new Point2D.Double(x2, y2));
    }

    @Override
    public String toString() {
        return "EdgeShape{" +
                "x1=" + x1 +
                ", y1=" + y1 +
                ", x2=" + x2 +
                ", y2=" + y2 +
                ", color=" + color +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EdgeShape edgeShape = (EdgeShape) o;
        return Objects.equals(color, edgeShape.color) &&
                (this.x1 == edgeShape.x1 && this.y1 == edgeShape.y1 && this.x2 == edgeShape.x2 && this.y2 == edgeShape.y2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color);
    }
}
