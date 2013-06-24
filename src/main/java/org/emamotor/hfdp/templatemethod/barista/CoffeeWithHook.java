package org.emamotor.hfdp.templatemethod.barista;

import java.util.Scanner;

public class CoffeeWithHook extends CaffeineBeverageWithHook {

    @Override
    public void brew() {
        System.out.println("フィルタでコーヒーをドリップします");
    }

    @Override
    public void addCondiments() {
        System.out.println("砂糖とミルクを追加します");
    }

    @Override
    public boolean customerWantsCondiments() {

        String answer = getUserInput();

        return answer.toLowerCase().startsWith("y") ? true : false;

    }

    private String getUserInput() {

        String answer = null;

        System.out.print("コーヒーに砂糖とミルクを入れますか? (y/n) > ");

        Scanner stdIn = new Scanner(System.in);
        answer = stdIn.next();

        if (answer == null) {
            return "no";
        }

        return answer;
    }

}
