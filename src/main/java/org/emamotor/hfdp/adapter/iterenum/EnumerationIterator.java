package org.emamotor.hfdp.adapter.iterenum;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationIterator<E> implements Iterator<E> {

    private Enumeration<E> _enumeration;

    public EnumerationIterator(Enumeration<E> enumeration) {
        _enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return _enumeration.hasMoreElements();
    }

    @Override
    public E next() {
        return _enumeration.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

}
