package com.ykb.training.oo.playground;

public class InhTestExt extends InhTest {
    String a;

    public InhTestExt() {
        this.a = "osman";
    }

    @Override
    public String hello() {
        return "hello " + super.a;
    }
}
