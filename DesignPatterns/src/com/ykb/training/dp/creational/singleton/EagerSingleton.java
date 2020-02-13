package com.ykb.training.dp.creational.singleton;

public class EagerSingleton {
    private static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return EagerSingleton.instance;
    }
}
