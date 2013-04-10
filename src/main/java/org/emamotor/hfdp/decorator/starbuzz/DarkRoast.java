package org.emamotor.hfdp.decorator.starbuzz;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description_ = "ダークロースト";
    }

    @Override
    public double cost() {
        return .99;
    }

}
