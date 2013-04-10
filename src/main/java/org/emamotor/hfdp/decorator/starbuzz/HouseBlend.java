package org.emamotor.hfdp.decorator.starbuzz;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description_ = "ハウスブレンドコーヒー";
    }

    @Override
    public double cost() {
        return .89;
    }
    
}
