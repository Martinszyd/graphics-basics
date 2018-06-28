package Graphics;

import javax.swing.*;
import java.awt.*;

public class MyFrame3 extends JFrame {

    public MyFrame3() {
        super("Hello World 3");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocation(150, 300);
        setSize(300, 150);
        setLayout(new BorderLayout());
        setResizable(false);

        add(new JButton("OK"));
        add(new JButton("No"));
        add(new JButton("Cancel"));

        add(new JLabel("Border Layout"));

    }
}
