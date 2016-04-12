package com.kurtz.creational.singleton;

/**
 * Created by P on 03.04.2016.
 */
public class LazyLoadingSingleton {
    private static LazyLoadingSingleton instance = null;

    private LazyLoadingSingleton() {

    }

    public static LazyLoadingSingleton getInstance() {
        if (instance == null) {
            instance = new LazyLoadingSingleton();
        }
        return instance;
    }
}
