package org.emamotor.hfdp.compound;

/**
 * @author Yoshimasa Tanabe
 */
public interface QuackObservable {
    void registerObserver(Observer observer);
    void notifyObservers();
}
