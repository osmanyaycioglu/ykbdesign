package com.ykb.training.dp.structural.bridge.inher;

public class Araba {
    String isim;
    int beygirGucu;

    public Araba(final String isim, final int beygirGucu) {
        super();
        this.isim = isim;
        this.beygirGucu = beygirGucu;
    }

    public String getIsim() {
        return this.isim;
    }

    public void setIsim(final String isim) {
        this.isim = isim;
    }

}
