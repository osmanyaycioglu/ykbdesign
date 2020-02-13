package com.ykb.training.oo.basics;

public enum ArabaStatus {
    START(1), RUN(5), STOP(10);

    private final int value;

    private ArabaStatus(final int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

}
