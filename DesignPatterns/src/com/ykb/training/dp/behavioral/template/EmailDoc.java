package com.ykb.training.dp.behavioral.template;

public class EmailDoc implements IDocument {

    @Override
    public String header() {
        return "email header";
    }

    @Override
    public String body() {
        return "email body";
    }

    @Override
    public String footer() {
        return "email footer";
    }

}
