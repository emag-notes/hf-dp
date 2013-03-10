package org.emamotor.hfdp.strategy;

/**
 * 抽象 鴨 クラス
 */
public abstract class Duck {

    // 飛ぶ振舞を委譲
    FlyBehavior flyBehavior;
    // 鳴く振舞を委譲
    QuackBehavior quackBehavior;

    public Duck() {}

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("すべての鴨は浮かびます。おとりの鴨でも！");
    }

}
