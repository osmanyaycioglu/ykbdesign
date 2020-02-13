package com.ykb.training.oo.strings;

public class StringTest {

    public static void main(final String[] args) {
//        Logger logger = LogManager.getLogManager()
//                                  .getLogger("osman");
//        if (logger.isLoggable(Level.FINE)) {
//            logger.fine("osman " + args);
//        }
        long delta = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            String s = "osman " + i;
//            String.format("osman %d",
//                          i);
        }
        System.out.println("Delta : " + (System.currentTimeMillis() - delta));
    }
}
