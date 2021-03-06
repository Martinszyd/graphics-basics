package Graphics;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class MyPanel extends JPanel {

    public MyPanel() {
        setPreferredSize(new Dimension(300, 100));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // prostokat
        Rectangle2D rectangle = new Rectangle2D.Double(10, 10, 90, 90);
        // kolo
        Ellipse2D circle = new Ellipse2D.Double(10, 10, 90, 90);

        g2d.draw(rectangle);
        g2d.fill(circle);
    }

}
