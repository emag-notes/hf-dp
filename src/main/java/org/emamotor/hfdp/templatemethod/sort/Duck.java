package org.emamotor.hfdp.templatemethod.sort;

public class Duck implements Comparable<Duck> {

    private String _name;
    private int    _weight;


    public Duck(String name, int weight) {
        _name = name;
        _weight = weight;
    }

    @Override
    public int compareTo(Duck other) {

        if (_weight < other._weight) {
            return -1;
        } else if (_weight == other._weight) {
            return 0;
        } else {
            return 1;
        }

    }

    @Override
    public String toString() {
        return _name + " の重さは " + _weight;
    }

}
