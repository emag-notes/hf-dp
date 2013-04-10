package org.emamotor.hfdp.decorator.starbuzz;

public class Mocha extends CondimentDecorator {

    private Beverage beverage_;

    public Mocha(Beverage beverage) {
        beverage_ = beverage;
    }

    @Override
    public String getDescription() {
        return beverage_.getDescription() + ", モカ";
    }

    @Override
    public double cost() {
        return .20 + beverage_.cost();
    }

}
