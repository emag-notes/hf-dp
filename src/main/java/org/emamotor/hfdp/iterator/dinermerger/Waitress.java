package org.emamotor.hfdp.iterator.dinermerger;

import java.util.List;

/**
 * @author emag
 */
public class Waitress {

    public void printMenu() {

        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        List<MenuItem> breakfastItems = pancakeHouseMenu.getMenuItems();

        DinerMenu dinerMenu = new DinerMenu();
        MenuItem[] lunchItems = dinerMenu.getMenuItems();

        for(MenuItem breakfastItem : breakfastItems) {
            System.out.print(breakfastItem.getName() + ", ");
            System.out.print(breakfastItem.getPrice() + " -- ");
            System.out.println(breakfastItem.getDescription());
        }

        for(int i = 0; i < lunchItems.length; i++) {
            MenuItem lunchItem = lunchItems[i];
            System.out.print(lunchItem.getName() + ", ");
            System.out.print(lunchItem.getPrice() + " -- ");
            System.out.println(lunchItem.getDescription());
        }

    }

}
