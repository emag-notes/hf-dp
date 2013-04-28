package org.emamotor.hfdp.factory.pizzas;

import org.emamotor.hfdp.factory.pizza.common.PizzaType;

public class PizzaStore {

    SimplePizzaFactory factory_;

    public PizzaStore(SimplePizzaFactory factory) {
        factory_ = factory;
    }


    public Pizza orderPizza(PizzaType type) {

        Pizza pizza;

        pizza = factory_.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;

    }
}
