package com.ykb.training.dp.creational.singleton;

public class SingletonRunner {
    public static void main(final String[] args) {
        LazySingleton.getInstance()
                     .hello();
        NewSingleton.INSTANCE.hello();
    }
}
