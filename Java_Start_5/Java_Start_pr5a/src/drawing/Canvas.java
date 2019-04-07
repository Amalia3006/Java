package drawing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.util.Random;

public class Canvas extends JPanel {
    private final DrawingFrame drawingFrame;
    private final int width, height;
    private BufferedImage image;
    private Graphics2D graphics;

    public Canvas(DrawingFrame drawingFrame) {
        this(drawingFrame, 1280, 720);
    }

    public Canvas(DrawingFrame drawingFrame, int width, int height) {
        this.width = width;
        this.height = height;

        setupBufferedImage();

        this.drawingFrame = drawingFrame;

        this.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent e) {
                drawNode(e.getX(), e.getY());
            }
        });
    }

    public BufferedImage getImage() {
        return image;
    }

    public void drawNode(int x, int y) {

        int fillColorNumber = drawingFrame.getFillColor();
        if (drawingFrame.isRandomFillColorSet()) {
            Random rand = new Random();
            fillColorNumber = rand.nextInt(0xFFFFFF);
        }

        graphics.setColor(new Color(fillColorNumber));
        graphics.fill(new NodeShape(x, y, drawingFrame.getRadius()));


        int strokeColorNumber = drawingFrame.getStrokeColor();
        if (drawingFrame.isRandomStrokeColorSet()) {
            Random rand = new Random();
            strokeColorNumber = rand.nextInt(0xFFFFFF);
        }

        graphics.setColor(new Color(strokeColorNumber));
        graphics.setStroke(new BasicStroke(drawingFrame.getStrokeWeight()));
        graphics.draw(new NodeShape(x, y, drawingFrame.getRadius()));

        this.repaint();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        g.drawImage(image, 0, 0, this);
    }

    private void setupBufferedImage() {
        image = new BufferedImage(this.width, this.height, BufferedImage.TYPE_INT_ARGB);
        graphics = image.createGraphics();
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        this.setPreferredSize(new Dimension(this.width, this.height));

        this.repaint();

        graphics.setColor(new Color(222, 200, 100));
        int w = image.getWidth();
        int h = image.getHeight();
        graphics.fill(new Rectangle(0, 0, w, h));
    }

    public void reset() {
        setupBufferedImage();
    }
}
