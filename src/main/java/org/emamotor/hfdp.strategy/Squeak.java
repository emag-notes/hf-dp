package org.emamotor.hfdp.strategy;

public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("キューキュー");
    }

}
