package org.emamotor.hfdp.state.gumballstate;

import java.util.Calendar;

/**
 * @author Yoshimasa Tanabe
 */
public class GumballMachine {

    enum State {
        SOLD_OUT,
        NO_QUARTER,
        HAS_QUARTER,
        SOLD
    }

    private State state = State.SOLD_OUT;
    private int count;

    public GumballMachine(int count) {
        this.count = count;
        if (count > 0) {
            state = State.NO_QUARTER;
        }
    }

    public void insertQuarter() {

        switch (state) {
            case SOLD_OUT:
                System.out.println("You can't insert a quarter, the machine is sold out");
                break;
            case NO_QUARTER:
                state = State.HAS_QUARTER;
                System.out.println("You inserted a quarter");
                break;
            case HAS_QUARTER:
                System.out.println("You can't insert another quarter");
                break;
            case SOLD:
                System.out.println("Please wait, we're already giving you a gumball");
                break;
        }

    }

    public void ejectQuarter() {

        switch (state) {
            case SOLD_OUT:
                System.out.println("You can't eject, you haven't inserted a quarter yet");
            case NO_QUARTER:
                System.out.println("You haven't inserted a quarter");
                break;
            case HAS_QUARTER:
                System.out.println("Quarter returned");
                state = State.NO_QUARTER;
                break;
            case SOLD:
                System.out.println("Sorry, you already turned the crank");
        }

    }

    public void turnCrank() {

        switch (state) {
            case SOLD_OUT:
                System.out.println("You turned, but there are no gumballs");
                break;
            case NO_QUARTER:
                System.out.println("You turned out but there's no quarter");
                break;
            case HAS_QUARTER:
                System.out.println("You turned...");
                state = State.SOLD;
                dispense();
                break;
            case SOLD:
                System.out.println("Turning twice doesn't get you another gumball!");
                break;
        }

    }

    public void dispense() {

        switch (state) {
            case SOLD_OUT:
                System.out.println("No gumball dispensed");
                break;
            case NO_QUARTER:
                System.out.println("You need to pay first");
                break;
            case HAS_QUARTER:
                System.out.println("No gumball dispensed");
                break;
            case SOLD:
                System.out.println("A gumball comes rolling out the slot");
                count--;
                if (count == 0) {
                    System.out.println("Oops, out of gumballs!");
                    state = State.SOLD_OUT;
                } else {
                    state = State.NO_QUARTER;
                }
        }
    }

    public void refill(int numGumBalls) {
        count = numGumBalls;
        state = State.NO_QUARTER;
    }

    public String toString() {

        StringBuilder result = new StringBuilder();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004-" + Calendar.getInstance().get(Calendar.YEAR) + "\n");
        result.append("Inventory: " + count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\nMachine is ");
        switch (state) {
            case SOLD_OUT:
                result.append("sold out");
                break;
            case NO_QUARTER:
                result.append("waiting for quarter");
                break;
            case HAS_QUARTER:
                result.append("waiting for turn of crank");
                break;
            case SOLD:
                result.append("delivering a gumball");
                break;
        }
        result.append("\n");
        return result.toString();

    }

}
