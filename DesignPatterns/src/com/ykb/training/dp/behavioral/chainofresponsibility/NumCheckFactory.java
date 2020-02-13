package com.ykb.training.dp.behavioral.chainofresponsibility;

import java.util.ArrayList;
import java.util.List;

public class NumCheckFactory {
    public static INumberCheck createCheckers() {
        List<INumberCheck> checkers = new ArrayList<>();
        checkers.add(new CheckLessThan0());
        checkers.add(new CheckGreater50());
        checkers.add(new CheckEqual0());
        checkers.add(new CheckLessThan50());
        NumberCheck check = new NumberCheck();
        check.setCheckList(checkers);
        return check;
    }
}
