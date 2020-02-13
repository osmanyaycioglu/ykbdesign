package com.ykb.training.oo.abstraction;

public class MyImpl implements IMyIntf, IMyThird {

    @Override
    public String execute(final String str) {
        return "Sayın " + str;
    }

    @Override
    public String process(final String str) {
        return "Mayın " + str;
    }

    @Override
    public String halay(final String str) {
        return "Halay " + str;
    }

}
