package org.emamotor.hfdp.compound;

import org.junit.Test;

/**
 * @author Yoshimasa Tanabe
 */
public class QuackableTest {

    @Test
    public void duckSimulate() throws Exception {
        // Setup
        Quackable mallarDuck = new QuackCounter(new MallarDuck());
        Quackable redheadDuck = new QuackCounter(new RedheadDuck());
        Quackable duckCall = new QuackCounter(new DuckCall());
        Quackable rubberDuck = new QuackCounter(new RubberDuck());
        Quackable gooseDuck = new GooseAdapter(new Goose());

        // Exercise
        // Verify
        System.out.println("Duck Simulator");

        simulate(mallarDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);

        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");
    }

    private static void simulate(Quackable duck) {
        duck.quack();
    }
}
