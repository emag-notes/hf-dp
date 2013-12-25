package org.emamotor.hfdp.compound;

/**
 * @author Yoshimasa Tanabe
 */
public class DuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallarDuck() {
        return new MallarDuck();
    }

    @Override
    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }
}
