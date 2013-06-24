package org.emamotor.hfdp.templatemethod.simplebarista;

public class Coffee {

    void prepareRecipe() {
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addSugarAndMilk();
    }

    public void boilWater() {
        System.out.println("お湯を沸かします");
    }

    public void brewCoffeeGrinds() {
        System.out.println("フィルタでコーヒーをドリップします");
    }

    public void addSugarAndMilk() {
        System.out.println("砂糖とミルクを追加します");
    }

    public void pourInCup() {
        System.out.println("カップに注ぎます");
    }

}
