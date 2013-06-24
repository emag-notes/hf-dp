package org.emamotor.hfdp.templatemethod.barista;

public class Tea extends CaffeineBeverage {

    @Override
    public void brew() {
        System.out.println("紅茶を浸します");
    }

    @Override
    public void addCondiments() {
        System.out.println("レモンを追加します");
    }

}
