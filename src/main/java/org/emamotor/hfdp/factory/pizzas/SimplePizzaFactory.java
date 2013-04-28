package org.emamotor.hfdp.factory.pizzas;

import org.emamotor.hfdp.factory.pizza.common.PizzaType;
import org.emamotor.hfdp.factory.pizza.common.UnknownPizzaTypeException;

public class SimplePizzaFactory {

    public Pizza createPizza(PizzaType type) {
        Pizza pizza = null;

        switch(type) {
            case CHEESE:
                pizza = new CheesePizza();
                break;
            case PEPPERONI:
                pizza = new PepperoniPizza();
                break;
            case CLAM:
                pizza = new ClamPizza();
                break;
            case VEGGIE:
                pizza = new VeggiePizza();
                break;
            default:
                throw new UnknownPizzaTypeException("不明なピザの種類です。");
        }
        return pizza;
    }

}
