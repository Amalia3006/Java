package drawing;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

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
        fillColorField = new JHexSpinner(0x16cc8f, 0x000000, 0xffffff, 1);

        randomFillColorCheckBox = new JCheckBox("Random fill color");

        radiusLabel = new JLabel("Radius");
        radiusField = new JSpinner(new SpinnerNumberModel(50, 5, 250, 1));

        strokeWeightLabel = new JLabel("Stroke weight");
        strokeWeightField = new JSpinner(new SpinnerNumberModel(5, 0, 150,1));

        strokeColorLabel = new JLabel("Stroke color");
        strokeColorField = new JHexSpinner(0xff0000, 0x000000, 0xffffff, 1);

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

    private boolean isRandomFillColorSet() {
        return randomFillColorCheckBox.isSelected();
    }

    public Color getFillColor() {
        if(isRandomFillColorSet())
            return randomColor();
        return new Color((int) fillColorField.getValue());
    }

    public int getRadius() {
        return (int) radiusField.getValue();
    }

    public int getStrokeWeight() {
        return (int) strokeWeightField.getValue();
    }

    private boolean isRandomStrokeColorSet() {
        return randomStrokeColorCheckBox.isSelected();
    }

    public Color getStrokeColor() {
        if(isRandomStrokeColorSet())
            return randomColor();
        return new Color((int) strokeColorField.getValue());
    }

    private Color randomColor() {
        return new Color(new Random().nextInt(0xFFFFFF));
    }
}
