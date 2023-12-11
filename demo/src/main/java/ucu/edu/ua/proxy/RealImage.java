package ucu.edu.ua.proxy;

import javax.swing.*;

public class RealImage implements MyImage {
    private final JFrame jFrame;

    public RealImage(String filename) {
        jFrame = new JFrame();
        ImageIcon imageIcon = new ImageIcon(filename);
        JLabel jLabel = new JLabel(imageIcon);
        jFrame.add(jLabel);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.pack();
    }

    public void display() {
        jFrame.setVisible(true);
    }
}
