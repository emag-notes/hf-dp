package org.emamotor.hfdp.strategy;

public class FlyRocketPowered implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("ロケットで飛んでいます！");
    }

}
