package org.emamotor.hfdp.adapter.ducks;

public class DuckTestDrive {

    public static void main(String... args) {

        MallarDuck duck = new MallarDuck();

        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("Turkey の出力: ");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nDuck の出力");
        testDuck(duck);

        System.out.println("\nTurkeyAdapter の出力: ");
        testDuck(turkeyAdapter);

    }

    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
