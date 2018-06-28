package Graphics;

import javax.swing.*;
import java.awt.*;

public class MyFrameDrawing extends JFrame {

    public MyFrameDrawing() {
        super("Drawing");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocation(450, 300);
        setSize(300, 150);
        JPanel panel = new MyPanel();

        add(panel);

        pack();

    }
}
