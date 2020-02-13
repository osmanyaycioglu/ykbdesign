package com.ykb.training.oo.collections;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class ListTest {
    public static void main(final String[] args) {
        List<String> strings = new Vector<>();
        List<String> threadSafestrings = Collections.synchronizedList(strings);
        long delta = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            strings.add("osman" + i);
        }
        delta = System.currentTimeMillis() - delta;
        System.out.println("Add Delta : " + delta);

        delta = System.currentTimeMillis();
        for (int i = 0; i < 10_000; i++) {
            strings.get(i);
        }
        delta = System.currentTimeMillis() - delta;
        System.out.println("Read Delta : " + delta);

        delta = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            strings.remove(0);
        }
        delta = System.currentTimeMillis() - delta;
        System.out.println("Delete Delta : " + delta);

    }
}
