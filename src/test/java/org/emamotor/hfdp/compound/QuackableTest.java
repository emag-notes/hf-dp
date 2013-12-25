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

        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());

        Flock flockOfDucks = new Flock();

        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);

        Flock flockOfMallards = new Flock();

        Quackable mallardOne = duckFactory.createMallarDuck();
        Quackable mallardTwo = duckFactory.createMallarDuck();
        Quackable mallardThree = duckFactory.createMallarDuck();
        Quackable mallardFour = duckFactory.createMallarDuck();

        flockOfMallards.add(mallardOne);
        flockOfMallards.add(mallardTwo);
        flockOfMallards.add(mallardThree);
        flockOfMallards.add(mallardFour);

        flockOfDucks.add(flockOfMallards);

        // Exercise
        // Verify
        System.out.println("Duck Simulator: With Observer");

        Quackologist quackologist = new Quackologist();
        flockOfDucks.registerObserver(quackologist);

        simulate(flockOfDucks);

        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");
    }

    private static void simulate(Quackable duck) {
        duck.quack();
    }
}
