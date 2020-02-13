package com.ykb.training.dp.behavioral.template;

public class TemplateMainRight {
    public static void main(final String[] args) {
        int index = 1;
        String str = "";
        IDocument document = new EmailDoc();
        StringBuilder builder = new StringBuilder();
        builder.append(document.header());
        builder.append(document.body());
        builder.append(document.footer());

        System.out.println(builder.toString());
    }
}
