package org.emamotor.hfdp.iterator.dinermerger;

import java.util.Iterator;
import java.util.List;

/**
 * @author emag
 */
public class Waitress {

    PancakeHouseMenu _pancakeHouseMenu;
    DinerMenu _diDinerMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        _pancakeHouseMenu = pancakeHouseMenu;
        _diDinerMenu = dinerMenu;
    }

    public void printMenu() {
        Iterator<MenuItem> pancakeIterator = _pancakeHouseMenu.createIterator();
        Iterator<MenuItem> dinerIterator   = _diDinerMenu.createIterator();

        System.out.println("メニュー");
        System.out.println("----");
        System.out.println("朝食");
        printMenu(pancakeIterator);
        System.out.println();
        System.out.println("昼食");
        printMenu(dinerIterator);
    }

    private void printMenu(Iterator<MenuItem> menuItemIterator) {
        while ( menuItemIterator.hasNext() ) {
            MenuItem menuItem = menuItemIterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }

    /*
     * リストや配列といった内部実装に依存したコード
     */
//    public void printMenu() {
//
//        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
//        List<MenuItem> breakfastItems = pancakeHouseMenu.getMenuItems();
//
//        DinerMenu dinerMenu = new DinerMenu();
//        MenuItem[] lunchItems = dinerMenu.getMenuItems();
//
//        for(MenuItem breakfastItem : breakfastItems) {
//            System.out.print(breakfastItem.getName() + ", ");
//            System.out.print(breakfastItem.getPrice() + " -- ");
//            System.out.println(breakfastItem.getDescription());
//        }
//
//        for(int i = 0; i < lunchItems.length; i++) {
//            MenuItem lunchItem = lunchItems[i];
//            System.out.print(lunchItem.getName() + ", ");
//            System.out.print(lunchItem.getPrice() + " -- ");
//            System.out.println(lunchItem.getDescription());
//        }
//    }

}
