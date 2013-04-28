package org.emamotor.hfdp.factory.pizzafm;

import org.emamotor.hfdp.factory.pizza.common.PizzaType;

public class NYPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(PizzaType type) {

        Pizza pizza = null;

        switch(type) {
            case CHEESE:
                pizza = new NYStyleCheesePizza();
                break;
            case VEGGIE:
                pizza = new NYStyleVeggiePizza();
                break;
            case CLAM:
                pizza = new NYStyleClamPizza();
                break;
            case PEPPERONI:
                pizza = new NYStylePepperoniPizza();
                break;
            default:
        }

        return pizza;

    }

}
