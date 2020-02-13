package com.ykb.training.dp.creational.abstractfactory.before;

public class InputFactory {
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
