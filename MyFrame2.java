package Graphics;

import javax.swing.*;
import java.awt.*;

public class MyFrame2 extends JFrame {

    public MyFrame2() {
        super("Hello World 2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocation(450, 100);
        setSize(300, 150);
        setLayout(new GridLayout(3,5));
        setResizable(false);

        add(new JButton("OK"));
        add(new JButton("No"));
        add(new JButton("Cancel"));

        add(new JLabel("Grid Layout"));

    }
}
