package org.emamotor.hfdp.compound.mvc;

/**
 * @author Yoshimasa Tanabe
 */
public class DJTestDrive {

    public static void main(String[] args) {
        BeatModelInterface model = new BeatModel();
        ControllerInterface controller = new BeatController(model);
    }
}
