package com.ykb.training.dp.structural.bridge;

public class Araba {
    String isim;
    int beygirGucu;
    YakitTipi yakitTipi;

    public Araba(final String isim, final int beygirGucu, final YakitTipi yakitTipi) {
        super();
        this.isim = isim;
        this.beygirGucu = beygirGucu;
        this.yakitTipi = yakitTipi;
    }

    public String getIsim() {
        return this.isim;
    }

    public void setIsim(final String isim) {
        this.isim = isim;
    }

}
