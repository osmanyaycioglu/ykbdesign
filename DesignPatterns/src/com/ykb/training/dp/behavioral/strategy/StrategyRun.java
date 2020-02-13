package com.ykb.training.dp.behavioral.strategy;

import com.ykb.training.dp.behavioral.strategy.inher.IAsker;

public class StrategyRun {
    public static void main(final String[] args) {
        IAsker a = new Asker(new YuksekVurusKapasitesi());
        a.atesEt();
        a.atesEt();
        a.atesEt();
        a.atesEt();
        a.atesEt();
        a.atesEt();
    }
}
