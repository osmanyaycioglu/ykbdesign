package com.ykb.training.dp.behavioral.strategy;

import java.util.Random;

public class OrtalamaVurusKapasitesi implements IVurusKapasitesi {

    @Override
    public void atesEt() {
        Random random = new Random();
        int nextInt = random.nextInt(100);
        if (nextInt > 50) {
            System.out.println("vurdum");
        } else {
            System.out.println("vuramadım");
        }
    }

}
