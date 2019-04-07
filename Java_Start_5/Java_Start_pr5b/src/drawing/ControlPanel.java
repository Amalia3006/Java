package drawing;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ControlPanel extends JPanel {
    private final DrawingFrame drawingFrame;

    private JButton loadButton;
    private JButton saveButton;
    private JButton resetButton;
    private JButton soundButton;

    public ControlPanel(DrawingFrame drawingFrame) {
        this.drawingFrame = drawingFrame;

        loadButton = new JButton("Load");
        saveButton = new JButton("Save");
        resetButton = new JButton("Reset");
        soundButton = new JButton("sound");

        this.add(loadButton);
        this.add(saveButton);
        this.add(resetButton);
        this.add(soundButton);


        resetButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                drawingFrame.resetCanvas();
            }
        });


    }
}
