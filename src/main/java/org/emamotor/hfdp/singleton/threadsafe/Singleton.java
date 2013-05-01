package org.emamotor.hfdp.singleton.threadsafe;

public class Singleton {

    private static Singleton uniqueInstance;

    private Singleton() {}

    // 初回実行時はスレッドセーフのために同期化の意味があるが、
    // 一度 uniqueInstance 変数に Singleton のインスタンスが設定されたら
    // それ以降は不要なオーバーヘッドになる
    public static synchronized Singleton getInstance() {
        if(uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
