package com.ykb.training.dp.behavioral.chainofresponsibility;

public class CheckEqual0 implements INumberCheck {

    @Override
    public boolean check(final int num) {
        if (num == 0) {
            System.out.println("Numara 0");
            return true;
        }
        return false;
    }

}
