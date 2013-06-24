package org.emamotor.hfdp.templatemethod.barista;

abstract public class CaffeineBeverageWithHook {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("お湯を沸かします");
    }

    void pourInCup() {
        System.out.println("カップに注ぎます");
    }

    boolean customerWantsCondiments() {
        return true;
    }
}
