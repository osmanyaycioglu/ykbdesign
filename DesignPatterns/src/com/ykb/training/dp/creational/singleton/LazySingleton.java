package com.ykb.training.dp.creational.singleton;

import java.util.ArrayList;
import java.util.List;

public class LazySingleton {
    private static volatile LazySingleton instance;
    private List<String> strings = new ArrayList<>();

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {

        if (LazySingleton.instance == null) {
            synchronized (LazySingleton.class) {
                if (LazySingleton.instance == null) {
                    LazySingleton.instance = new LazySingleton();
                }
            }
        }
        return LazySingleton.instance;
    }

    public void hello() {
        this.strings.add("hellox");
        System.out.println("Hello world");
    }

}
