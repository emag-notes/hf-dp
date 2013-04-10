package org.emamotor.hfdp.decorator.starbuzz;

public class Soy extends CondimentDecorator {

    private Beverage beverage_;

    public Soy(Beverage beverage) {
        beverage_ = beverage;
    }

    @Override
    public String getDescription() {
        return beverage_.getDescription() + ", 豆乳";
    }

    @Override
    public double cost() {
        return .15 + beverage_.cost();
    }

}
