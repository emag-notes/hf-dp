package org.emamotor.hfdp.templatemethod.barista;

public class Coffee extends CaffeineBeverage {

    @Override
    public void brew() {
        System.out.println("フィルタでコーヒーをドリップします");
    }

    @Override
    public void addCondiments() {
        System.out.println("砂糖とミルクを追加します");
    }

}
