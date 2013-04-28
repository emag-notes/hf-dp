package org.emamotor.hfdp.factory.pizzafm;

import org.emamotor.hfdp.factory.pizza.common.PizzaType;

abstract public class PizzaStore {

    abstract Pizza createPizza(PizzaType type);

    public Pizza orderPizza(PizzaType type) {

        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;

    }
}
