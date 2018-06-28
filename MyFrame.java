package Graphics;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    public MyFrame() {
        super("Hello World");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocation(150, 100);
        setSize(300, 150);
        setLayout(new FlowLayout());
        setResizable(false);

        add(new JButton("OK"));
        add(new JButton("No"));
        add(new JButton("Cancel"));

        add(new JLabel("Flow Layout"));

    }
}
