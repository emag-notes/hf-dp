package org.emamotor.hfdp.decorator.starbuzz;

public class Whip extends CondimentDecorator {

    private Beverage beverage_;

    public Whip(Beverage beverage) {
        beverage_ = beverage;
    }

    @Override
    public String getDescription() {
        return beverage_.getDescription() + ", ホイップ";
    }

    @Override
    public double cost() {
        return .10 + beverage_.cost();
    }

}
