package com.ykb.training.dp.behavioral.chainofresponsibility;

public class CheckLessThan50 implements INumberCheck {

    @Override
    public boolean check(final int num) {
        if (num <= 50) {
            System.out.println("50 yada 50 den küçük");
            return true;
        }
        return false;
    }

}
