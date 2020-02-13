package com.ykb.training.oo.collections;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(final String[] args) {
        Set<String> strSet = new HashSet<>();
        strSet.add("1");
        strSet.add("1");
        strSet.add("1");
        strSet.add("1");
        strSet.add("1");
        strSet.add("1");
        strSet.add("3");
        strSet.add("5");
        strSet.add("7");

        Set<String> strSet2 = new HashSet<>();
        strSet2.add("2");
        strSet2.add("3");
        strSet2.add("4");
        strSet2.add("5");
        strSet2.add("6");
        strSet2.add("7");
        strSet2.add("8");
        strSet2.add("9");
        strSet2.add("10");

        strSet.addAll(strSet2);
        strSet.retainAll(strSet2);
        strSet.removeAll(strSet2);

    }
}
