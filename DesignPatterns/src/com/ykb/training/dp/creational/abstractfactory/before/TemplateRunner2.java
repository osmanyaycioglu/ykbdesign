package com.ykb.training.dp.creational.abstractfactory.before;

import java.util.Scanner;

public class TemplateRunner2 {
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        IButon buton = ButtonFactory.createButton(index);
        IText text = TextFactory.createText(index);
        IInput input = InputFactory.createInput(index);

        buton.buttonColor();
        text.TextColor();
        input.inputColor();
    }
}
