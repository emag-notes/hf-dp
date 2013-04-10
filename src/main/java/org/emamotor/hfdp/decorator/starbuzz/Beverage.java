package org.emamotor.hfdp.decorator.starbuzz;

public abstract class Beverage {

    protected String description_ = "不明な飲み物";

    public String getDescription() {
        return description_;
    }

    public abstract double cost();

}
