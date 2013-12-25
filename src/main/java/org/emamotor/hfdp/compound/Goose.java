package org.emamotor.hfdp.compound;

/**
 * @author Yoshimasa Tanabe
 */
public class Goose {
    public void honk() {
        System.out.println("Honk");
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
