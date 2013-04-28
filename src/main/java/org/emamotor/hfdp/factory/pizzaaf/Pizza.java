package org.emamotor.hfdp.factory.pizzaaf;

abstract public class Pizza {

    String name;
    Dough dough;
    Sauce sauce;
    Veggies[] veggies;
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;

    abstract void prepare();

    void bake() {
        System.out.println("Baking " + name);
    }

    void cut() {
        System.out.println("Cutting " + name);
    }

    void box() {
        System.out.println("Boxing " + name);
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    public String toString() {

        StringBuilder disply = new StringBuilder();
        disply.append("---- " + name + " ----\n");
        if (dough != null) {
            disply.append(dough + "\n");
        }
        if (sauce != null) {
            disply.append(sauce + "\n");
        }
        if (cheese != null) {
            disply.append(cheese + "\n");
        }
        if (veggies != null) {
            for(Veggies v : veggies) {
                disply.append(v);
                if (v != veggies[veggies.length-1]) {
                    disply.append(", ");
                }
            }
        }
        if (clams != null) {
            disply.append(clams + "\n");
        }
        if (pepperoni != null) {
            disply.append(pepperoni + "\n");
        }

        return disply.toString();
    }

}
