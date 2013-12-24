package org.emamotor.hfdp.state.gumball;

import org.junit.Test;

/**
 * @author Yoshimasa Tanabe
 */
public class GumballMachineTest {

    @Test
    public void testAllMethod() throws Exception {
        // Setup
        GumballMachine sut = new GumballMachine(5);

        // Exercise
        // Verify
        System.out.println(sut);

        sut.insertQuarter();
        sut.turnCrank();

        System.out.println(sut);

        sut.insertQuarter();
        sut.ejectQuarter();
        sut.turnCrank();

        System.out.println(sut);

        sut.insertQuarter();
        sut.turnCrank();
        sut.insertQuarter();
        sut.turnCrank();
        sut.ejectQuarter();

        System.out.println(sut);

        sut.insertQuarter();
        sut.insertQuarter();
        sut.turnCrank();
        sut.insertQuarter();
        sut.turnCrank();
        sut.insertQuarter();
        sut.turnCrank();

        System.out.println(sut);
    }
        
}
