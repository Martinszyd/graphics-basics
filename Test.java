package Graphics;

import java.awt.*;

public class Test {

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MyFrame();
            }
        });

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MyFrame2();
            }
        });

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MyFrame3();
            }
        });

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MyFrameDrawing();
            }
        });
    }
}
