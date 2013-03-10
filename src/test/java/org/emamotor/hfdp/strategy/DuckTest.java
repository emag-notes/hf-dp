package org.emamotor.hfdp.strategy;

import org.junit.Test;

public class DuckTest {

    @Test
    public void MallardDuckはガーガーと鳴き飛ぶ() {
        Duck sut = new MallardDuck();
        sut.performFly();
        sut.performQuack();
    }

    @Test
    public void ModelDuckは当初飛べないが改良を経てロケットで飛ぶ() {
        Duck sut = new ModelDuck();
        sut.performFly();
        sut.setFlyBehavior(new FlyRocketPowered());
        sut.performFly();
    }

}
