package org.emamotor.hfdp.adapter.ducks;

public class TurkeyTestDrive {

    public static void main(String... args) {

        MallarDuck duck = new MallarDuck();
        Turkey duckAdapter = new DuckAdapter(duck);

        for (int i = 0; i < 10; i++) {
            System.out.println("DuckAdapter の出力: ");
            duckAdapter.gobble();
            duckAdapter.fly();
        }

    }
}
