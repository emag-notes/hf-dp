package org.emamotor.hfdp.state.gumballstate;

import org.junit.Test;

/**
 * @author Yoshimasa Tanabe
 */
public class GumballMachineTest {

    @Test
    public void testAllMethods() throws Exception {
        // Setup
        GumballMachine sut = new GumballMachine(5);

        // Exercise
        // Verify
        System.out.println(sut);

        sut.insertQuarter();
        sut.turnCrank();

        System.out.println(sut);

        sut.insertQuarter();
        sut.turnCrank();
        sut.insertQuarter();
        sut.turnCrank();

        System.out.println(sut);
    }
}
