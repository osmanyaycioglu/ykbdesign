package com.ykb.training.dp.behavioral.strategy.inher;

import java.util.Random;

public class KeskinNisanciAsker extends Asker {
    @Override
    public void atesEt() {
        Random random = new Random();
        int nextInt = random.nextInt(100);
        if (nextInt > 10) {
            System.out.println("vurdum");
        } else {
            System.out.println("vuramadım");
        }
    }
}
