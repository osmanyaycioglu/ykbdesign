package com.ykb.training.dp.creational.singleton;

import java.util.ArrayList;
import java.util.List;

public enum NewSingleton {
    INSTANCE;

    private List<String> strings = new ArrayList<>();

    public void hello() {
        this.strings.add("abc");
        System.out.println("Hello world");
    }

}
