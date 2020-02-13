package com.ykb.training.oo.abstraction;

public abstract class AbstractFirst implements IMyIntf, IMyThird {
    @Override
    public String execute(final String str) {
        return "Sayın " + str;
    }

    @Override
    public String process(final String str) {
        return "Mayın " + str;
    }

}
