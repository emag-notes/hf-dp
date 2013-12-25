package org.emamotor.hfdp.compound;

/**
 * @author Yoshimasa Tanabe
 */
public class MallarDuck implements Quackable {
    private Observable observable;

    public MallarDuck() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Quack");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
