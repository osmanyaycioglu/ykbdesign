package com.ykb.training.dp.creational.abstractfactory.before;

public class ButtonFactory {
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
}
