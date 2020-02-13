package com.ykb.training.oo.playground;

public class Runner {
    public static void main(final String[] args) {
        InhTest inhTest = new InhTestExt();
        System.out.println(inhTest.hello());
        System.out.println(inhTest.a);
    }
}
