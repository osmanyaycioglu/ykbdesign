package com.ykb.training.dp.behavioral.chainofresponsibility;

public class CheckLessThan0 implements INumberCheck {

    @Override
    public boolean check(final int num) {
        if (num < 0) {
            System.out.println("0 dan küçük");
            return true;
        }
        return false;
    }

}
