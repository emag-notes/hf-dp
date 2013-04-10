package org.emamotor.hfdp.decorator.starbuzz;

public class Espresso extends Beverage {

    public Espresso() {
        description_ = "エスプレッソ";
    }

    @Override
    public double cost() {
        return 1.99;
    }

}
