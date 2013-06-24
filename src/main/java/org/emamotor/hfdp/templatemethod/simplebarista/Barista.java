package org.emamotor.hfdp.templatemethod.simplebarista;

public class Barista {

    public static void main(String... args) {

        Coffee coffee = new Coffee();
        Tea tea = new Tea();

        System.out.println("コーヒーを作ります...");
        coffee.prepareRecipe();

        System.out.println("\n紅茶を作ります...");
        tea.prepareRecipe();

    }
}
