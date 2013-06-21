package org.emamotor.hfdp.adapter.ducks;

public class MallarDuck implements Duck {

    @Override
    public void quack() {
        System.out.println("ガーガー");
    }

    @Override
    public void fly() {
        System.out.println("飛んでいます");
    }
}
