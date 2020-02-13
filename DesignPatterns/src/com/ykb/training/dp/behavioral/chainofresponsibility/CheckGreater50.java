package com.ykb.training.dp.behavioral.chainofresponsibility;

public class CheckGreater50 implements INumberCheck {

    @Override
    public boolean check(final int num) {
        if (num > 50) {
            System.out.println("50 den büyük");
            return true;
        }
        return false;
    }

}
