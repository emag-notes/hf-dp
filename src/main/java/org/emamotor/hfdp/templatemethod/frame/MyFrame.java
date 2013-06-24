package org.emamotor.hfdp.templatemethod.frame;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    public MyFrame(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(300, 300);
        this.setVisible(true);
    }

    public void paint(Graphics graphics) {
        super.paint(graphics);
        String msg = "私が支配する！！";
        graphics.drawString(msg, 100, 100);
    }

    public static void main(String... args) {
        new MyFrame("Head First デザインパターン");
    }

}
