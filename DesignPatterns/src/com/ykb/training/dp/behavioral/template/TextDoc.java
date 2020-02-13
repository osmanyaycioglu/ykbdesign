package com.ykb.training.dp.behavioral.template;

public class TextDoc implements IDocument {

    @Override
    public String header() {
        return "header";
    }

    @Override
    public String body() {
        return "body";
    }

    @Override
    public String footer() {
        return "footer";
    }

}
