package com.ykb.training.dp.behavioral.chainofresponsibility;

public class CORRun {
    public static void main(final String[] args) {
        INumberCheck createCheckers = NumCheckFactory.createCheckers();
        createCheckers.check(-1);

    }
}
