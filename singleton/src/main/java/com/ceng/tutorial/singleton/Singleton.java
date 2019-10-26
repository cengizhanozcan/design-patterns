package com.ceng.tutorial.singleton;

/**
 * @author Cengizhan Ozcan
 */
public class Singleton {

    private static volatile Singleton instance = null;

    private static Object lock = new Object();

    private Singleton() {
    }

    public static Singleton instance() {
        if (instance == null) {
            synchronized (lock) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }

}
