package org.emamotor.hfdp.factory.pizzas;

import java.util.ArrayList;
import java.util.List;

abstract public class Pizza {

    String name_;
    String dough_;
    String sauce_;
    List<String> toppings_ = new ArrayList<>();

    public String getName() {
        return name_;
    }

    public void prepare() {
        System.out.println("Preparing " + name_);
    }

    public void bake() {
        System.out.println("Baking " + name_);
    }

    public void cut() {
        System.out.println("Cutting " + name_);
    }

    public void box() {
        System.out.println("Boxing " + name_);
    }

    public String toString() {
        // code to display pizza name and ingredients
        StringBuilder disply = new StringBuilder();
        disply.append("---- " + name_ + " ----\n");
        disply.append(dough_ + "\n");
        disply.append(sauce_ + "\n");
        for(String topping : toppings_) {
            disply.append(topping + "\n");
        }
        return disply.toString();
    }

}
