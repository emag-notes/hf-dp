package org.emamotor.hfdp.factory.pizzaaf.client;

import static org.emamotor.hfdp.factory.pizza.common.PizzaType.*;
import org.emamotor.hfdp.factory.pizzaaf.ChicagoPizzaStore;
import org.emamotor.hfdp.factory.pizzaaf.NYPizzaStore;
import org.emamotor.hfdp.factory.pizzaaf.Pizza;
import org.emamotor.hfdp.factory.pizzaaf.PizzaStore;

public class PizzaTestDrive {

    public static void main(String... args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza(CHEESE);
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = chicagoStore.orderPizza(CHEESE);
        System.out.println("Joel ordered a " + pizza + "\n");

        pizza = nyStore.orderPizza(CLAM);
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = chicagoStore.orderPizza(CLAM);
        System.out.println("Joel ordered a " + pizza + "\n");

        pizza = nyStore.orderPizza(PEPPERONI);
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = chicagoStore.orderPizza(PEPPERONI);
        System.out.println("Joel ordered a " + pizza + "\n");

        pizza = nyStore.orderPizza(VEGGIE);
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = chicagoStore.orderPizza(VEGGIE);
        System.out.println("Joel ordered a " + pizza + "\n");
    }

}
