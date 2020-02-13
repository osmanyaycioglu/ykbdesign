package com.ykb.training.dp.creational.abstractfactory.before;

public class ObjectFactory {
    public static IButon createButton(final int index) {
        switch (index) {
        case 1:
            return new BlueButton();
        case 2:
            return new RedButton();

        default:
            return new BlueButton();
        }
    }

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

    public static IInput createInput(final int index) {
        switch (index) {
        case 1:
            return new BlueInput();
        case 2:
            return new RedInput();

        default:
            return new BlueInput();
        }
    }

}
