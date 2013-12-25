package org.emamotor.hfdp.compound;

import org.junit.Test;

/**
 * @author Yoshimasa Tanabe
 */
public class QuackableTest {

    @Test
    public void duckSimulate() throws Exception {
        // Setup
        AbstractDuckFactory duckFactory = new CountingDuckFactory();

        Quackable mallarDuck = duckFactory.createMallarDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());

        // Exercise
        // Verify
        System.out.println("Duck Simulator: With Abstract Factory");

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
