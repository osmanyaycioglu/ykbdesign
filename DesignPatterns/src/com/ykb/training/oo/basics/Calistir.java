package com.ykb.training.oo.basics;

public class Calistir {
    private static final int START = 1;
    private static final int RUN = 2;
    private static final int STOP = 3;

    public static void main(final String[] args) {
        Araba a = Araba.createArabaBasic("BMW",
                                         170);
        Araba b = Araba.createArabaFull("BMW",
                                        170,
                                        10_00);
        int choice = 1;
        switch (choice) {
        case START:
            System.out.println("START");
            break;
        case RUN:
            System.out.println("RUN");
            break;
        case STOP:
            System.out.println("STOP");
            break;

        default:
            break;
        }

        ArabaStatus arabaStatus = ArabaStatus.START;
        switch (arabaStatus) {
        case RUN:
            break;
        case START:
            break;
        case STOP:
            break;
        default:
            break;
        }
    }
}
