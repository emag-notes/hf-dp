package org.emamotor.hfdp.factory.pizzas;

import org.emamotor.hfdp.factory.pizza.common.PizzaType;
import org.junit.Test;

public class PizzaStoreTest {

    @Test
    public void チーズピザと野菜ピザを注文する() {

        PizzaStore sut = new PizzaStore(new SimplePizzaFactory());

        Pizza pizza = sut.orderPizza(PizzaType.CHEESE);
        System.out.println("We ordered a " + pizza.getName() + "\n");

        pizza = sut.orderPizza(PizzaType.VEGGIE);
        System.out.println("We ordered a " + pizza.getName() + "\n");

    }
}
