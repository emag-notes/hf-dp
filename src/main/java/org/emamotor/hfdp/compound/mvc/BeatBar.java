package org.emamotor.hfdp.compound.mvc;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

/**
 * @author Yoshimasa Tanabe
 */
public class BeatBar extends JProgressBar implements Runnable {

    private JProgressBar progressBar;
    private Thread thread;

    public BeatBar() {
        thread = new Thread(this);
        setMaximum(100);
        thread.start();
    }

    @Override
    public void run() {
        while (true) {
            int value = getValue();
            value = (int) (value * 0.75);
            setValue(value);
            repaint();
            try {
                TimeUnit.MICROSECONDS.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
