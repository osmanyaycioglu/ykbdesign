package com.ykb.training.oo.basics;

public class Araba {
    private static final int LIMIT_BEYGIRGUCU = 10;

    private String model;
    private int beygirGucu;
    private long zaman;

    private Araba() {
    }

    private Araba(final String model, final int beygirGucu, final long zaman) {
        super();
        this.model = model;
        this.beygirGucu = beygirGucu;
        this.zaman = zaman;
    }

    private Araba(final String model, final int beygirGucu) {
        super();
        this.model = model;
        this.beygirGucu = beygirGucu;
    }

    public static Araba createArabaBasic(final String model, final int beygirGucu) {
        return new Araba(model, beygirGucu);
    }

    public static Araba createArabaFull(final String model, final int beygirGucu, final long zaman) {
        return new Araba(model, beygirGucu, zaman);
    }

    public int git() {
        return this.getBeygirGucu();
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(final String model) {
        this.model = model;
    }

    public int getBeygirGucu() {
        return this.beygirGucu;
    }

    public void setBeygirGucu(int beygirGucu) {
        if (beygirGucu < Araba.LIMIT_BEYGIRGUCU) {
            beygirGucu = 10;
        }
        this.beygirGucu = beygirGucu;
    }

    public long getZaman() {
        return this.zaman;
    }

    public void setZaman(final long zaman) {
        this.zaman = zaman;
    }

}
