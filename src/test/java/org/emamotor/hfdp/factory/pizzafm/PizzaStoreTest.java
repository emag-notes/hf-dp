package org.emamotor.hfdp.factory.pizzafm;

import static org.emamotor.hfdp.factory.pizza.common.PizzaType.*;
import org.junit.Test;

public class PizzaStoreTest {

    @Test
    public void NYとChicagoからそれぞれピザを注文する() {

        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza(CHEESE);
        System.out.println("イーサンの注文は" + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza(CHEESE);
        System.out.println("ジョエルの注文は" + pizza.getName() + "\n");

    }
}
