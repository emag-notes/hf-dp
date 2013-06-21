package org.emamotor.hfdp.adapter.ducks;

public class TurkeyAdapter implements Duck {

    Turkey _turkey;

    public TurkeyAdapter(Turkey turkey) {
        _turkey = turkey;
    }

    @Override
    public void quack() {
        _turkey.gobble();
    }

    @Override
    public void fly() {
        // 七面鳥は短い距離しか飛べないため、
        // 鴨の距離を表現するために5回呼び出す
        for (int i = 0; i < 5; i++) {
            _turkey.fly();
        }
    }
}
