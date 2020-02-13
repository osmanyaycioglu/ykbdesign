package com.ykb.training.dp.behavioral.iterator;

import java.util.List;

public class IteRun {
    public static void main(final String[] args) {
        MyObject myObject = new MyObject();
        List<String> strings = myObject.getStrings();
        IteRun.something(strings);
    }

    public static void something(final List<String> strs) {
        strs.remove(0);
    }
}
