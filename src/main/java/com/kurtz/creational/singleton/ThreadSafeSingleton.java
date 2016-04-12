package com.kurtz.creational.singleton;

/**
 * Created by P on 03.04.2016.
 */
public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance = null;

    private ThreadSafeSingleton() {

    }

    public static ThreadSafeSingleton getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                instance = new ThreadSafeSingleton();
            }
        }

        return instance;
    }
}
