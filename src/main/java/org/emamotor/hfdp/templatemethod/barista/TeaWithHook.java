package org.emamotor.hfdp.templatemethod.barista;

import java.util.Scanner;

public class TeaWithHook extends CaffeineBeverageWithHook {

    @Override
    public void brew() {
        System.out.println("紅茶を浸します");
    }

    @Override
    public void addCondiments() {
        System.out.println("レモンを追加します");
    }

    @Override
    public boolean customerWantsCondiments() {

        String answer = getUserInput();

        return answer.toLowerCase().startsWith("y") ? true : false;

    }

    private String getUserInput() {

        String answer = null;

        System.out.print("紅茶にレモンを入れますか? (y/n) > ");

        Scanner stdIn = new Scanner(System.in);
        answer = stdIn.next();

        if (answer == null) {
            return "no";
        }

        return answer;
    }

}
