package org.emamotor.hfdp.singleton.dcl;

/*
 * 注意: Java のバージョンが 1.4 以前の場合は、
 * volatile による同期化が保証されない。
 */
public class Singleton {

    /*
     * volatile キーワードは、uniqueInstance 変数を
     * Singleton インスタンスに対して初期化する際に、
     * マルチスレッドが uniqueInstance 変数を
     * 正しく処理できるように保証するものである。
     */
    private volatile static Singleton uniqueInstance;

    private Singleton() {}

    /*
     * 二重チェックロッキングでは、まずインスタンスが作成されているか調べ、
     * もし作成されていなければそのときには同期化を行う。
     * このようにして初回実行時のみ同期化するため、
     * getInstance 実行時のオーバーヘッドを削減できる。
     */
    public static synchronized Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
