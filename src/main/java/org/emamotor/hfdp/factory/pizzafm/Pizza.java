package org.emamotor.hfdp.factory.pizzafm;

import java.util.ArrayList;
import java.util.List;

abstract public class Pizza {

    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<>();

    String getName() {
        return name;
    }

    void prepare() {
        System.out.println("Preparing " + name);
    }

    void bake() {
        System.out.println("Baking " + name);
    }

    void cut() {
        System.out.println("Cutting " + name);
    }

    void box() {
        System.out.println("Boxing " + name);
    }

    public String toString() {
        // code to display pizza name and ingredients
        StringBuilder disply = new StringBuilder();
        disply.append("---- " + name + " ----\n");
        disply.append(dough + "\n");
        disply.append(sauce + "\n");
        for(String topping : toppings) {
            disply.append(topping + "\n");
        }
        return disply.toString();
    }

}
