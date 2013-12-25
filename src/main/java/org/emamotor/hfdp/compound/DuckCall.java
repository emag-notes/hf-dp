package org.emamotor.hfdp.compound;

/**
 * @author Yoshimasa Tanabe
 */
public class DuckCall implements Quackable {
    @Override
    public void quack() {
        System.out.println("Kwak");
    }
}
