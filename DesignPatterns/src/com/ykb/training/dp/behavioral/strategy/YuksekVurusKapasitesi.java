package com.ykb.training.dp.behavioral.strategy;

import java.util.Random;

public class YuksekVurusKapasitesi implements IVurusKapasitesi {

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
