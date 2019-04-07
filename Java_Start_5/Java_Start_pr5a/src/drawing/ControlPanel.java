package drawing;

import javax.imageio.ImageIO;
import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.*;

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

        saveButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                File file = new File("./canvas.png");
                try {
                    ImageIO.write(drawingFrame.getCanvas().getImage(), "png", file);
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });

        soundButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                File soundFile = new File("D:/lab6_28.04_pa/BUG.wav");
                try {
                    AudioInputStream sound = AudioSystem.getAudioInputStream(soundFile);
                    Clip clip = AudioSystem.getClip();
                    clip.open(sound);
                    clip.loop(Clip.LOOP_CONTINUOUSLY);
                    System.out.print(sound.getFrameLength());

                } catch (UnsupportedAudioFileException e1) {
                    e1.printStackTrace();
                } catch (IOException e1) {
                    e1.printStackTrace();
                } catch (LineUnavailableException e1) {
                    e1.printStackTrace();
                }
            }
        });

    }
}
