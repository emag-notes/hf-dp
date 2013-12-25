package org.emamotor.hfdp.compound;

/**
 * @author Yoshimasa Tanabe
 */
public class CountingDuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallarDuck() {
        return new QuackCounter(new MallarDuck());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}
