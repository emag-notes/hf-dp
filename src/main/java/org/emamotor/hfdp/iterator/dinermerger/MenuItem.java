package org.emamotor.hfdp.iterator.dinermerger;

/**
 * @author emag
 */
public class MenuItem {

    String  name;
    String  description;
    boolean vegetarian;
    double  price;

    public MenuItem(String  name,
                    String  description,
                    boolean vegetarian,
                    double  price) {

        this.name        = name;
        this.description = description;
        this.vegetarian  = vegetarian;
        this.price       = price;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }
}
