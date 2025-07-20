package main;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Grading System");
        frame.setContentPane(new LoginPage().getMainPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(300, 200));
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

    }

}
