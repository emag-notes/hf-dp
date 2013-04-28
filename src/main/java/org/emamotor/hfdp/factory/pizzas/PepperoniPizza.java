package org.emamotor.hfdp.factory.pizzas;

public class PepperoniPizza extends  Pizza {

    public PepperoniPizza() {
        name_ = "Pepperoni Pizza";
        dough_ = "Crust";
        sauce_ = "Marinara Sauce";
        toppings_.add("Sliced Pepperoni");
        toppings_.add("Sliced Onion");
        toppings_.add("Grated parmesan cheese");
    }

}
