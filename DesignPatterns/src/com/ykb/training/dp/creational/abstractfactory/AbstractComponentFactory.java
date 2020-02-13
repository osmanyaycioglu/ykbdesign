package com.ykb.training.dp.creational.abstractfactory;

public class AbstractComponentFactory {
    public static IComponents createComponents(final int index) {
        switch (index) {
        case 1:
            return new BlueComponents();
        case 2:
            return new RedComponents();
        default:
            return new BlueComponents();
        }
    }
}
