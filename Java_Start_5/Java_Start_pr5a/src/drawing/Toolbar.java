package drawing;

import javax.swing.*;
import java.awt.*;

public class Toolbar extends JPanel {
    private final DrawingFrame drawingFrame;

    private JLabel fillColorLabel;
    private JSpinner fillColorField;

    private JCheckBox randomFillColorCheckBox;

    private JLabel radiusLabel;
    private JSpinner radiusField;

    private JLabel strokeWeightLabel;
    private JSpinner strokeWeightField;

    private JLabel strokeColorLabel;
    private JSpinner strokeColorField;

    private JCheckBox randomStrokeColorCheckBox;

    public Toolbar(DrawingFrame drawingFrame) {
        this.drawingFrame = drawingFrame;

        this.setLayout(new GridLayout(0, 2));

        fillColorLabel = new JLabel("Fill color");
        fillColorField = new JHexSpinner(0x16cc8f, 0x000000, 0xffffff, 20);

        randomFillColorCheckBox = new JCheckBox("Random fill color");

        radiusLabel = new JLabel("Radius");
        radiusField = new JSpinner(new SpinnerNumberModel(50, 5, 250, 20));

        strokeWeightLabel = new JLabel("Stroke weight");
        strokeWeightField = new JSpinner(new SpinnerNumberModel(5, 0, 150,20));

        strokeColorLabel = new JLabel("Stroke color");
        strokeColorField = new JHexSpinner(0xff0000, 0x000000, 0xffffff, 20);

        randomStrokeColorCheckBox = new JCheckBox("Random stroke color");

        this.add(fillColorLabel);
        this.add(fillColorField);

        this.add(new JLabel());
        this.add(randomFillColorCheckBox);

        this.add(radiusLabel);
        this.add(radiusField);

        this.add(strokeWeightLabel);
        this.add(strokeWeightField);

        this.add(strokeColorLabel);
        this.add(strokeColorField);

        this.add(new JLabel());
        this.add(randomStrokeColorCheckBox);
    }

    public boolean isRandomFillColorSet() {
        return randomFillColorCheckBox.isSelected();
    }

    public int getFillColor() {
        return (int) fillColorField.getValue();
    }

    public int getRadius() {
        return (int) radiusField.getValue();
    }

    public int getStrokeWeight() {
        return (int) strokeWeightField.getValue();
    }

    public boolean isRandomStrokeColorSet() {
        return randomStrokeColorCheckBox.isSelected();
    }

    public int getStrokeColor() {
        return (int) strokeColorField.getValue();
    }
}
