package org.emamotor.hfdp.iterator.dinermerger;

/**
 * @author emag
 */
public class MenuTestDrive {

    public static void main(String... args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);

        waitress.printMenu();
    }
}
