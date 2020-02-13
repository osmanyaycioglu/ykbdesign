package com.ykb.training.dp.structural.bridge;

public abstract class YakitTipi {
    private int harcama;

    public YakitTipi(final int harcama) {
        super();
        this.setHarcama(harcama);
    }

    public int getHarcama() {
        return harcama;
    }

    public void setHarcama(int harcama) {
        this.harcama = harcama;
    }

}
