package org.emamotor.hfdp.factory.pizzaaf;

import org.emamotor.hfdp.factory.pizza.common.PizzaType;

public class ChicagoPizzaStore extends PizzaStore {

    private static String STYLE = "Chicago Style ";

    @Override
    protected Pizza createPizza(PizzaType type) {

        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPIzzaIngredientFactory();

        switch(type) {
            case CHEESE:
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName(STYLE + "Cheese Pizza");
                break;
            case VEGGIE:
                pizza = new VeggiePizza(ingredientFactory);
                pizza.setName(STYLE + "Veggie Pizza");
                break;
            case CLAM:
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName(STYLE + "Clam Pizza");
                break;
            case PEPPERONI:
                pizza = new PepperoniPizza(ingredientFactory);
                pizza.setName(STYLE + "Pepperoni Pizza");
                break;
            default:
        }

        return pizza;

    }

}
