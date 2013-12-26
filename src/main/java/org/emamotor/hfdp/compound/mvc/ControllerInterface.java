package org.emamotor.hfdp.compound.mvc;

/**
 * @author Yoshimasa Tanabe
 */
public interface ControllerInterface {
    void start();
    void stop();
    void increaseBPM();
    void decreaseBPM();
    void setBPM(int bpm);
}
