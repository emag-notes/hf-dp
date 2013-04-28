package org.emamotor.hfdp.factory.pizzas;

public class VeggiePizza extends  Pizza {

    public VeggiePizza() {
        name_ = "Veggie Pizza";
        dough_ = "Crust";
        sauce_ = "Marinara Sauce";
        toppings_.add("Shredded mozzarella");
        toppings_.add("Grated parmesan");
        toppings_.add("Diced onion");
        toppings_.add("Sliced mushrooms");
        toppings_.add("Sliced red pepper");
        toppings_.add("Sliced black olives");
    }

}
