package org.emamotor.hfdp.factory.pizzaaf;

import org.emamotor.hfdp.factory.pizza.common.PizzaType;

public class NYPizzaStore extends PizzaStore {

    private static String STYLE = "New York Style ";

    @Override
    protected Pizza createPizza(PizzaType type) {

        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPIzzaIngredientFactory();

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
