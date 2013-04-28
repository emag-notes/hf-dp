package org.emamotor.hfdp.factory.pizzafm;

import org.emamotor.hfdp.factory.pizza.common.PizzaType;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(PizzaType type) {

        Pizza pizza = null;

        switch(type) {
            case CHEESE:
                pizza = new ChicagoStyleCheesePizza();
                break;
            case VEGGIE:
                pizza = new ChicagoStyleVeggiePizza();
                break;
            case CLAM:
                pizza = new ChicagoStyleClamPizza();
                break;
            case PEPPERONI:
                pizza = new ChicagoStylePepperoniPizza();
                break;
            default:
        }

        return pizza;

    }

}
