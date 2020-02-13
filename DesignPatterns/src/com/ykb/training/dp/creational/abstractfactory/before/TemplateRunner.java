package com.ykb.training.dp.creational.abstractfactory.before;

import java.util.Scanner;

public class TemplateRunner {
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        IButon buton = ObjectFactory.createButton(index);
        IText text = ObjectFactory.createText(index);
        IInput input = ObjectFactory.createInput(index);

        buton.buttonColor();
        text.TextColor();
        input.inputColor();
    }
}
