package org.emamotor.hfdp.state.gumballstate;

/**
 * @author Yoshimasa Tanabe
 */
public interface State {

    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();

}
