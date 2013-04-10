package org.emamotor.hfdp.decorator.starbuzz;

import org.junit.Test;

public class BeverageTest {

    @Test
    public void 注文のテスト() {

        Beverage sut1 = new Espresso();
        printItem(sut1.getDescription(), sut1.cost());

        Beverage sut2 = new DarkRoast();
        sut2 = new Mocha(sut2);
        sut2 = new Mocha(sut2);
        sut2 = new Whip(sut2);
        printItem(sut2.getDescription(), sut2.cost());

        Beverage sut3 = new HouseBlend();
        sut3 = new Soy(sut3);
        sut3 = new Mocha(sut3);
        sut3 = new Whip(sut3);
        printItem(sut3.getDescription(), sut3.cost());

    }

    private void printItem(String name, double cost) {
        System.out.println(name + " $" + cost);
    }
}
