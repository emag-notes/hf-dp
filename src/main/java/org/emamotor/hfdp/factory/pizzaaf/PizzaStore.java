package org.emamotor.hfdp.factory.pizzaaf;

import org.emamotor.hfdp.factory.pizza.common.PizzaType;

abstract public class PizzaStore {

    abstract protected Pizza createPizza(PizzaType type);

    public Pizza orderPizza(PizzaType type) {

        Pizza pizza = createPizza(type);

        System.out.println("--- Making a " + pizza.getName() + " ---");

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;

    }
}
