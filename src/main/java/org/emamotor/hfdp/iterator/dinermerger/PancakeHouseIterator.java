package org.emamotor.hfdp.iterator.dinermerger;

import java.util.Iterator;
import java.util.List;

/**
 * @author emag
 */
public class PancakeHouseIterator implements Iterator<MenuItem> {

    List<MenuItem> _menuItems;
    int _position;

    public PancakeHouseIterator(List<MenuItem> menuItems) {
        _menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (_position >= _menuItems.size()) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = _menuItems.get(_position);
        _position++;
        return menuItem;
    }

    // Not supported
    @Override
    public void remove() {
        throw new UnsupportedOperationException("remove method is not supported");
    }
}
