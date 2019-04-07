package drawing;

import javax.swing.*;
import java.awt.*;

public class DrawingFrame extends JFrame {
    private Toolbar toolbar;
    private Canvas canvas;
    private ControlPanel controlPanel;

    public DrawingFrame() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);

        toolbar = new Toolbar(this);
        canvas = new Canvas(this);
        controlPanel = new ControlPanel(this);

        this.getContentPane().setLayout(new BorderLayout());

        this.getContentPane().add(toolbar, BorderLayout.NORTH);
        this.getContentPane().add(canvas, BorderLayout.CENTER);
        this.getContentPane().add(controlPanel, BorderLayout.SOUTH);

        this.pack();
    }

    public Canvas getCanvas() {
        return canvas;
    }

    public void setCanvas(Canvas canvas) {
        this.canvas = canvas;
    }

    public boolean isRandomFillColorSet() {
        return toolbar.isRandomFillColorSet();
    }

    public int getFillColor() {
        return toolbar.getFillColor();
    }

    public int getRadius() {
        return toolbar.getRadius();
    }

    public int getStrokeWeight() {
        return toolbar.getStrokeWeight();
    }

    public int getStrokeColor() {
        return toolbar.getStrokeColor();
    }

    public boolean isRandomStrokeColorSet() {
        return toolbar.isRandomStrokeColorSet();
    }

    public void resetCanvas() {
        canvas.reset();
    }
}
