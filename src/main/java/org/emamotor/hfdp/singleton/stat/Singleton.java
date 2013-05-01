package org.emamotor.hfdp.singleton.stat;

public class Singleton {

    // クラスがロードされる時点で JVM が Singleton の唯一のインスタンスを確実に生成する。
    // JVM はスレッドが static 変数 uniqueInstance にアクセスする前に
    // インスタンスが作成されていることを保証する。
    // Singleton の作成時や実行時のオーバーヘッドが負担にならない場合は、良いアプローチ。
    private static Singleton uniqueInstance = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return uniqueInstance;
    }
}
