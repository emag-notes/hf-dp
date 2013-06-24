package org.emamotor.hfdp.templatemethod.barista;

public class BeverageTestDrive {

    public static void main(String... args) {

        CaffeineBeverage coffee = new Coffee();
        CaffeineBeverage tea    = new Tea();

        System.out.println("[コーヒーを作ります...]");
        coffee.prepareRecipe();

        System.out.println("\n[紅茶を作ります...]");
        tea.prepareRecipe();


        CaffeineBeverageWithHook coffeeWithHook = new CoffeeWithHook();
        CaffeineBeverageWithHook teaWithHook    = new TeaWithHook();

        System.out.println("\n[コーヒを作ります(WithHook)...]");
        coffeeWithHook.prepareRecipe();

        System.out.println("\n[紅茶を作ります(WithHook)...]");
        teaWithHook.prepareRecipe();

    }

}
