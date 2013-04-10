package org.emamotor.hfdp.decorator.starbuzz;

public class Milk extends CondimentDecorator {

    private Beverage beverage_;

    public Milk(Beverage beverage) {
        beverage_ = beverage;
    }

    @Override
    public String getDescription() {
        return beverage_.getDescription() + ", スチームミルク";
    }

    @Override
    public double cost() {
        return .10 + beverage_.cost();
    }

}
