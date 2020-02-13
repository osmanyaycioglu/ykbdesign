package com.ykb.training.dp.creational.abstractfactory.before;

public class TextFactory {
    public static IText createText(final int index) {
        switch (index) {
        case 1:
            return new BlueText();
        case 2:
            return new RedText();

        default:
            return new BlueText();
        }
    }
}
