package org.emamotor.hfdp.templatemethod.applet;

import java.applet.Applet;
import java.awt.*;

public class MyApplet extends Applet {

    String _message;

    @Override
    public void init() {
        _message = "みなさんこんにちは、私は生きています！";
        repaint();
    }

    @Override
    public void start() {
        _message = "私は起動中です...";
        repaint();
    }

    @Override
    public void stop() {
        _message = "あー、現在私は停止中です...";
        repaint();
    }

    @Override
    public void destroy() {
        _message = "さよなら、この残酷な世界...";
    }

    @Override
    public void paint(Graphics g) {
        g.drawString(_message, 5, 15);
    }
}
