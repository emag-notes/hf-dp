package org.emamotor.hfdp.iterator.dinermerger;

import java.util.Iterator;

/**
 * @author emag
 */
public class DinerMenuIterator implements Iterator<MenuItem> {

    MenuItem[] _menuItems;
    int _position = 0;

    public DinerMenuIterator(MenuItem[] menuItems) {
        _menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (_position >= _menuItems.length || _menuItems[_position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = _menuItems[_position];
        _position++;
        return menuItem;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("remove method is not supported");
    }
}
