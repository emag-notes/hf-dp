package org.emamotor.hfdp.templatemethod.simplebarista;

public class Tea {

    void prepareRecipe() {
        boilWater();
        steepTeaBag();
        pourInCup();
        addLemon();
    }

    public void boilWater() {
        System.out.println("お湯を沸かします");
    }

    public void steepTeaBag() {
        System.out.println("紅茶を浸します");
    }

    public void addLemon() {
        System.out.println("レモンを追加します");
    }

    public void pourInCup() {
        System.out.println("カップに注ぎます");
    }

}
