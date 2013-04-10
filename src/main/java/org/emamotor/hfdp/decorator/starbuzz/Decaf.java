package org.emamotor.hfdp.decorator.starbuzz;

public class Decaf extends Beverage {

    public Decaf() {
        description_ = "カフェイン抜き";
    }

    @Override
    public double cost() {
        return 1.05;
    }

}
