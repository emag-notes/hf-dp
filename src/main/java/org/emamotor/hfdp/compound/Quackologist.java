package org.emamotor.hfdp.compound;

/**
 * @author Yoshimasa Tanabe
 */
public class Quackologist implements Observer {
    @Override
    public void update(QuackObservable duck) {
        System.out.println("Quacklogist: " + duck + " just quacked.");
    }
}
