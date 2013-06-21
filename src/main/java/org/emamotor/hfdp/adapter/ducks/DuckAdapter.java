package org.emamotor.hfdp.adapter.ducks;

import java.util.Random;

public class DuckAdapter implements Turkey {

    Duck _duck;
    Random _rand;

    public DuckAdapter(Duck duck) {
        _duck = duck;
        _rand = new Random();
    }

    @Override
    public void gobble() {
        _duck.quack();
    }

    @Override
    public void fly() {
        if (_rand.nextInt(5) == 0) {
            _duck.fly();
        }
    }

}
