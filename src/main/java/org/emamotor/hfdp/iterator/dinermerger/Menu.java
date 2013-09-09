package org.emamotor.hfdp.iterator.dinermerger;

import java.util.Iterator;

/**
 * @author emag
 */
public interface Menu {
    Iterator<MenuItem> createIterator();
}
